package com.hamitmizrak.springboot.mvc;

import com.hamitmizrak.springboot.data.ProductDto;
import com.hamitmizrak.springboot.data.ProductEntity;
import com.hamitmizrak.springboot.data.impl.IProduct;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@Controller
@Log4j2
public class ProductController {

    @Autowired
    IProduct iProduct;

    //FAKE DATA
    //http://localhost:8080/product/save/fake
    @GetMapping("/product/save/fake")
    @ResponseBody
    public String fakeProduct() {
        for (int i = 1; i <= 10; i++) {
            UUID uuid = UUID.randomUUID();
            ProductEntity entity = ProductEntity.builder()
                    .productId(0L).productName("ürün adı " + i + " " + uuid).productTrade("ürün marka")
                    .build();
            iProduct.save(entity);
        }
        return "Product Save Başarılı";
    }

    //LISTELEME
    //http://localhost:8080/product/list2
    @GetMapping("/product/list2")
    public String list2Product(Model model) {
        Iterable<ProductEntity> listem = iProduct.findAll();
        model.addAttribute("key_list", listem);
        return "datalist";
    }


    //http://localhost:8080/product/save
    @GetMapping("/product/save")
    public String getProduct(Model model){
        model.addAttribute("key_validation2",new ProductDto());
        return "save";
    }

    //http://localhost:8080/product/save
    @PostMapping("/product/save")
    public String postProduct(@Valid @ModelAttribute("key_validation2") ProductDto productDto, BindingResult result){
        if(result.hasErrors()){
            log.error("Hata oluştur");
            return "save";
        }

        ProductEntity entity=new ProductEntity();
        entity.setProductName(productDto.getProductName());
        entity.setProductTrade(productDto.getProductTrade());
       iProduct.save(entity);
        return "redirect:/product/list2";
    }


    //FIND
    //http://localhost:8080/product/find/1
    @GetMapping("/product/find/{id}")
    @ResponseBody
    public String findProductId(@PathVariable(name = "id") Long id) {
        //null pointer exception almamak için
        Optional<ProductEntity> entityOptional = iProduct.findById(id);
        if (entityOptional.isPresent()) {
            return "Bulundu. " + entityOptional.get();
        } else {
            return "ID: " + id + " bulunmadı";
        }
    }


    //DELETE
    //http://localhost:8080/product/delete/2
    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") Long id) {
        Optional<ProductEntity> entityOptional = iProduct.findById(id);
        if (entityOptional.isPresent()) {
            iProduct.deleteById(id);
            //return "silindi. " + entityOptional.get();
            return "redirect:/product/list2";
        } else {
            return "redirect:/product/list2";
        }
    }


    //UPDATE
    //http://localhost:8080/product/update/1
    @GetMapping("/product/update/{id}")
    @ResponseBody
    public String updateProduct(@PathVariable(name = "id") Long id) {
        Optional<ProductEntity> entityOptional = iProduct.findById(id); //findById(id).orElseThrow(() - > new IllegalArgumentException("Invalid student Id:" + id));
        String name, trade;
        if (entityOptional.isPresent()) {
            name = JOptionPane.showInputDialog("ürün adı giriniz");
            trade = JOptionPane.showInputDialog("ürün markayı giriniz");
            ProductEntity entity = entityOptional.get();
            entity.setProductName(name);
            entity.setProductTrade(trade);
            iProduct.save(entity);
            return "güncellendi. " + entityOptional.get();
        } else {
            return "ID: " + id + " bulunmadı güncelleyeyim";
        }
    }

    //LISTELEME
    //http://localhost:8080/product/list
    @GetMapping("/product/list")
    @ResponseBody
    public String listProduct() {
        Iterable<ProductEntity> listem = iProduct.findAll();
        for (ProductEntity temp : listem) {
            log.info(temp);
        }
        return "Listelendi " + listem;
    }



    /////////////////////////////////////////////////////////////////
    //SELECT
    //http://localhost:8080/product/findproductname/ürün adı
    @GetMapping("/product/findproductname/{name}")
    @ResponseBody
    public String productName(@PathVariable(name = "name") String productNAme) {
        Iterable<ProductEntity> listem = iProduct.findProductEntityByProductName(productNAme);
        for (ProductEntity temp : listem) {
            log.info(temp);
        }
        return "Listelendi " + listem;
    }

}
