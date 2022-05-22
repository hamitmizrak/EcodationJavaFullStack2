package com.hamitmizrak.mvc;

import com.hamitmizrak.database.dto.RegisterDto;
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
public class FormValidationController {

    //http://localhost:8080/validation
    @GetMapping("validation")
    public String getValidation(Model model){
        model.addAttribute("key_validation",new RegisterDto());
        return "validation_page";
    }

    //http://localhost:8080/validation
    @PostMapping("validation")
    public String postValidation(@Valid @ModelAttribute("key_validation") RegisterDto registerDto, BindingResult result){
    if(result.hasErrors()){
        log.error("Hata oluştur");
        return "validation_page";
    }
    log.info(registerDto);
        return "success";
    }

}
