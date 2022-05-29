package com.hamitmizrak.project.mvcdata;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

//http://localhost:8080/h2-console

@Controller
@Log4j2
public class _5_CustomerController implements _4_ICustomer {

    @Autowired
    _3_ICustomerRepository repository;



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
    @GetMapping("customer/save")
    public String getCustomer(Model model) {
        model.addAttribute("validation_customer",new _1_CustomerDto());
        return "customer_list";
    }

    //http://localhost:8080/customer/save
    @Override
    @PostMapping("customer/save")
    public String postCustomer(_1_CustomerDto customerDto, BindingResult bindingResult) {
        return "customer_list";
    }

    //LIST
    //http://localhost:8080/customer/list
    @Override
    @GetMapping("customer/list")
    public String listCustomer(Model model) {
        List<_2_CustomerEntity> listem=  repository.findAll();
        model.addAttribute("list_customer",listem);
        return "customer_list";
    }

    //FIND
    @Override
    public String findCustomer(Long id) {
        return null;
    }

    //UPDATE
    @Override
    public String updateCustomer(Long id) {
        return null;
    }

    //DELETE
    @Override
    public String deleteCustomer(Long id) {
        return null;
    }
}
