package com.hamitmizrak.project.mvcdata;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface _4_ICustomer {

    //Fake Create
    public List<_2_CustomerEntity> fakeImportData();

    //Save
    public String getCustomer(Model model);
    public String postCustomer(_1_CustomerDto customerDto, BindingResult bindingResult);

    //List
    public String listCustomer(Model model);

    //Find
    public String findCustomer(Long id,Model model);

    //Update
    public String updateCustomer(Long id);

    // Delete
    public String deleteCustomer(Long id, Model model);


}
