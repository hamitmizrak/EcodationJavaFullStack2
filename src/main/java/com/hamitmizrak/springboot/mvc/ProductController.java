package com.hamitmizrak.springboot.mvc;

import com.hamitmizrak.springboot.data.ProductEntity;
import com.hamitmizrak.springboot.data.impl.IProduct;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String getProduct() {
        for (int i = 1; i <=10 ; i++) {
            UUID uuid=UUID.randomUUID();
            ProductEntity entity = ProductEntity.builder()
                    .productId(0L).productName("ürün adı: "+i+" "+uuid).productTrade("ürün marka")
                    .build();
            iProduct.save(entity);
        }
        return "Product Save Başarılı";
    }


}
