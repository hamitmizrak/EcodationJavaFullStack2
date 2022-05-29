package com.hamitmizrak.project.mvcdata;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//http://localhost:8080/h2-console

@Controller
@Log4j2
public class _5_CustomerController implements _4_ICustomer {

    @Autowired
    _3_ICustomerRepository repository;

    private static void sendMail(String message){
        log.error("Hata oluştur"+message);
    }


    //http://localhost:8080/customer/save/fake
    @Override
    @GetMapping("customer/save/fake")
    @ResponseBody
    public List<_2_CustomerEntity> fakeImportData() {
        List<_2_CustomerEntity> entityList = new ArrayList<>();
        _2_CustomerEntity entity = null;
        for (int i = 1; i < 10; i++) {
            entity = _2_CustomerEntity.builder()
                    .customerName("adi " + i)
                    .customerSurname("soyadi " + i)
                    .customerHesCode("hescode " + i)
                    .build();
            repository.save(entity);
            entityList.add(entity);
        }
        return entityList;
    }

    //SAVE
    //http://localhost:8080/customer/save
    @Override
    @GetMapping("/customer/save")
    public String getCustomer(Model model) {
        model.addAttribute("validation_customer",new _1_CustomerDto());
        return "customer_save";
    }

    //http://localhost:8080/customer/save
    @Override
    @PostMapping("/customer/save")
    public String postCustomer(@Valid  @ModelAttribute("validation_customer") @RequestBody _1_CustomerDto customerDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "customer_save";
        }
        _2_CustomerEntity entity=new _2_CustomerEntity();
        entity.setCustomerName(customerDto.getCustomerName());
        entity.setCustomerSurname(customerDto.getCustomerSurname());
        entity.setCustomerHesCode(customerDto.getCustomerHesCode());
        repository.save(entity);
        return "redirect:/customer/list";
    }

    //LIST
    //http://localhost:8080/customer/list
    @Override
    @GetMapping("/customer/list")
    public String listCustomer(Model model) {
        List<_2_CustomerEntity> listem=  repository.findAll();
        model.addAttribute("list_customer",listem);
        return "customer_list";
    }

    //FIND
    //http://localhost:8080/customer/find/1
    @Override
    @GetMapping("/customer/find/{id}")
    public String findCustomer(@PathVariable(name = "id") Long id,Model model) {
        Optional<_2_CustomerEntity> find= repository.findById(id);
        if(find.isPresent()){
            //return "Bulundu"+find.get();
            model.addAttribute("find_key",find.get());
            return "customer_view";
        }
        else
            return "redirect:/customer/list";
    }

    //UPDATE
    @Override
    @GetMapping("/customer/update/{id}")
    public String updateCustomer(@PathVariable(name = "id") Long id) {
        return null;
    }



    //DELETE
    //http://localhost:8080/customer/delete/4
    @Override
    @GetMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable(name = "id") Long id, Model model) {
        Optional<_2_CustomerEntity> find= repository.findById(id);
        if(find.isPresent()){
            repository.deleteById(id);
            model.addAttribute("data","success");
        }
        else{
            model.addAttribute("data","failed");
        }
        return "redirect:/customer/list";
    }
}
