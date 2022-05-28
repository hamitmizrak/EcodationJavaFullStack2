package com.hamitmizrak.springboot.mvc;

import com.hamitmizrak.springboot.data.ProductEntity;
import com.hamitmizrak.springboot.data.impl.IProduct;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;
import java.util.Optional;
import java.util.UUID;

@Controller
@Log4j2
public class ProductController {

    @Autowired
    IProduct iProduct;

    //SAVE
    //http://localhost:8080/product/save
    @GetMapping("/product/save")
    @ResponseBody
    public String saveProduct() {
        for (int i = 1; i <= 10; i++) {
            UUID uuid = UUID.randomUUID();
            ProductEntity entity = ProductEntity.builder()
                    .productId(0L).productName("ürün adı: " + i + " " + uuid).productTrade("ürün marka")
                    .build();
            iProduct.save(entity);
        }
        return "Product Save Başarılı";
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
    @ResponseBody
    public String deleteProduct(@PathVariable(name = "id") Long id) {
        Optional<ProductEntity> entityOptional = iProduct.findById(id);
        if (entityOptional.isPresent()) {
            iProduct.deleteById(id);
            return "silindi. " + entityOptional.get();
        } else {
            return "ID: " + id + " bulunmadı silemedim";
        }
    }


    //UPDATE
    //http://localhost:8080/product/update/1
    @GetMapping("/product/update/{id}")
    @ResponseBody
    public String updateProduct(@PathVariable(name = "id") Long id) {
        Optional<ProductEntity> entityOptional = iProduct.findById(id);
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
        Iterable<ProductEntity> listem=  iProduct.findAll();
        for(ProductEntity temp:listem){
            log.info(temp);
        }
        return "Listelendi "+listem;
    }


    //LISTELEME
    //http://localhost:8080/product/list2
    @GetMapping("/product/list2")
    public String list2Product(Model model) {
        Iterable<ProductEntity> listem=  iProduct.findAll();
        model.addAttribute("key_list",listem);
        return "datalist";
    }

}
