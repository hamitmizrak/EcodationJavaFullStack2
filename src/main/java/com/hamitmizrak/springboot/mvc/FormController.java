package com.hamitmizrak.springboot.mvc;

import com.hamitmizrak.database.dto.AdminDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Log4j2
public class FormController {

    //http://localhost:8080/form
    @GetMapping("form")
    public String getAdminForm(Model model) {
        model.addAttribute("form_key",new AdminDto());
        return "form";
    }

    //http://localhost:8080/form
    @PostMapping("form")
    public String postAdminForm(Model model, AdminDto adminDto) {
        log.info(adminDto);
        model.addAttribute("form_key",adminDto);
        return "form";
    }

}
