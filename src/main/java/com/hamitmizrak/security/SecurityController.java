package com.hamitmizrak.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecurityController {

    //PUBLIC
    //http://localhost:8080/public
    @GetMapping("/public")
    public String getPublic(Model model) {
        model.addAttribute("key", "public");
        return "public";
    }

    //PRIVATE
    //http://localhost:8080/private
    @GetMapping("/private")
    public String getPrivate(Model model) {
        model.addAttribute("key", "private");
        return "private";
    }

    //http://localhost:8080/login
    //http://localhost:8080/login?error
    //http://localhost:8080/register
    @GetMapping("/register")
    public String getRegister( @RequestParam(name = "error",required = false) String error, Model model){
        if(error!=null){
            model.addAttribute("key_login","Kullanıcı adınız veya şifreniz yanlış");
        }else{
            model.addAttribute("key_login","Kullanıcı bilgilerini eksiksiz giriniz");
        }
        return "register";
    }
}
