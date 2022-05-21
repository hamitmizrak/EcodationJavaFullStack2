package com.hamitmizrak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {


    //http://localhost:8080/controller0
    @GetMapping("/controller0")
    @ResponseBody
    public String getController0(){
        return "Merhabalar ben @Controllerim";
    }


    //http://localhost:8080/controller1
    @GetMapping("/controller1")
    public String getController1(){
        return "thymeleaf1";
    }

    //http://localhost:8080/controller2
    @GetMapping("/controller2")
    public String getController2(Model model){
        model.addAttribute("key","modelden geldim");
        return "thymeleaf2";
    }



}
