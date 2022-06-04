package com.hamitmizrak.project.validation;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Log4j2
public class _2_LoginController {

    //http://localhost:8080/login
    @GetMapping("login")
    public String getLogin(Model model) {
        model.addAttribute("login_key", new _1_LoginDto());
        return "login";
    }

    //http://localhost:8080/login
    @PostMapping("login")
    public String postLogin(@Valid @ModelAttribute("login_key") _1_LoginDto loginDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("Hata var");
            return "login";
        }
        log.info(loginDto);
        return "login";
    }

}
