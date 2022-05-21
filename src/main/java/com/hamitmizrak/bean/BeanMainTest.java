package com.hamitmizrak.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeanMainTest {

    @Autowired
    BeanConfig  beanConfig;

    //http://localhost:8080//bean/beandto
    @GetMapping("/bean/beandto")
    public BeanDto getBeanDto(){
        return beanConfig.beanDto();
    }

}
