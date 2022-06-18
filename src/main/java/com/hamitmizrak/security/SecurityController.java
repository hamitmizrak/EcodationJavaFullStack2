package com.hamitmizrak.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
        String user="";
        if(authentication!=null){
            user=authentication.getName();
        }

        model.addAttribute("system_user", user);
        return "private";
    }

    //http://localhost:8080/register
    //http://localhost:8080/register?error
    @GetMapping("/register")
    public String getRegister( @RequestParam(name = "error",required = false) String error, Model model){
        if(error!=null){
            model.addAttribute("key_login","Kullanıcı adınız veya şifreniz yanlış");
        }else{
            model.addAttribute("key_login","Kullanıcı bilgilerini eksiksiz giriniz");
        }
        return "register";
    }


    //Logout
    //http://localhost:8080/logout
   @GetMapping("/logout")
    public String getLogout(HttpServletRequest request, HttpServletResponse response, Model model){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        if(authentication!=null){
            new SecurityContextLogoutHandler().logout(request,response,authentication);
            model.addAttribute("key_logout","Çıkış başarılı");
        }else{
            model.addAttribute("key_logout","Çıkış başarısızzzzzz");
        }
        return "logout";
    }

}
