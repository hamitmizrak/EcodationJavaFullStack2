package com.hamitmizrak.springboot.mvc;

import com.hamitmizrak.database.dto.RegisterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

@Controller
@Log4j2
public class FormValidationController {

    private static final String PATH="C:\\file\\mvc.txt";

    //Yazmak
    public void fileWriter(String  registerDto){
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(PATH,true))){
            bufferedWriter.append(registerDto);
            bufferedWriter.flush();
        }catch (Exception e){
            log.error("Yazmada Sıkıntı oluştu");
            e.printStackTrace();
        }
    }

    //Okumak
    public void fileReader(){
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(PATH))){
           StringBuilder builder=new StringBuilder();
           String satir="";
           while( (satir=bufferedReader.readLine())!=null){
               builder.append(satir+"\n");
           }
           log.info("Okuyorum"+builder.toString());
        }catch (Exception e){
            log.error("Yazmada Sıkıntı oluştu");
            e.printStackTrace();
        }
    }


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
    //Database
    // dosyaya kaydetmek
    FormValidationController controller=new FormValidationController();
    controller.fileWriter(registerDto+"");
    log.info(registerDto);
    controller.fileReader();
        return "success";
    }

}
