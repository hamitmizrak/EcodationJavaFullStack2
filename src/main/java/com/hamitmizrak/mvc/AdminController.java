package com.hamitmizrak.mvc;

import com.hamitmizrak.database.dto.AdminDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    //http://localhost:8080/controller0
    //URL URI
    @GetMapping("/controller0")
    @ResponseBody
    public String getController0() {
        return "Merhabalar ben @Controllerim";
    }

    //Html
    //http://localhost:8080/controller1
    @GetMapping("/controller1")
    public String getController1() {
        return "thymeleaf1";
    }

    //String
    //http://localhost:8080/controller2
    //MVC nedir ?
    //Spring Boot nedir ?
    //Spring Boot ile Spring Framework arasındki farklar nelerdir ?
    @GetMapping("/controller2")
    public String getController2(Model model) {
        model.addAttribute("key", "modelden geldim");
        return "thymeleaf2";
    }


    //Object
    //http://localhost:8080/controller3
    @GetMapping("/controller3")
    public String getController3(Model model) {
        AdminDto adminDto = AdminDto.builder().adminId(5L).name("Adı").surname("Soyadı").build();
        model.addAttribute("key", adminDto);
        return "thymeleaf3";
    }


}