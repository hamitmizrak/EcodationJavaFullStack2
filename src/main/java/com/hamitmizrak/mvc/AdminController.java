package com.hamitmizrak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {


    //http://localhost:8080/controller1
    @GetMapping("/controller1")
    @ResponseBody
    public String getController1(){
        return "Merhabalar ben @Controllerim";
    }
}
