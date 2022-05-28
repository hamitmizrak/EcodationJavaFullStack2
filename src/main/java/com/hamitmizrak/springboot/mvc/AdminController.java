package com.hamitmizrak.springboot.mvc;

import com.hamitmizrak.database.dto.AdminDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    //Object List
    //http://localhost:8080/controller4
    @GetMapping("/controller4")
    public String getController4(Model model) {
        List<AdminDto> adminDtoList=new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            adminDtoList.add(new AdminDto(i,"name"+i," surname "+i,1000*i)  );
        }
        model.addAttribute("key", adminDtoList);
        return "thymeleaf4";
    }

    //+++PathVariable+++
    //http://localhost:8080/controller5/4
    //http://localhost:8080/controller5
    @GetMapping({"/controller5","/controller5/{id}"})
    public String getController5(Model model, @PathVariable(name = "id",required = false) Long data) {
        if(data==null){
            model.addAttribute("key", "ID bulunamadı ");
        }else{
            model.addAttribute("key", "ID: "+data);
        }
        return "thymeleaf5";
    }

    //+++RequestParam+++
    // http://localhost:8080/controller6?adi=Hamit&soyadi=Mızrak
    // http://localhost:8080/controller6?adi=Hamit&soyadi=Mızrak&id=4
    @GetMapping("controller6")
    public String getController6(Model model,
                                 @RequestParam(name = "adi") String  adi,
                                 @RequestParam(name = "soyadi") String  soyadi ,
                                 @RequestParam(name = "id" ,required = false,defaultValue ="0") Long  id
    ) {
            model.addAttribute("key", "ID: "+id+ " Adı: "+adi+" Soyadı: "+soyadi);
        return "thymeleaf6";
    }

}
