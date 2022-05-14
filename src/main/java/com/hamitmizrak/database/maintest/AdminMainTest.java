package com.hamitmizrak.database.maintest;

import com.hamitmizrak.database.controller.AdminController;
import com.hamitmizrak.database.dto.AdminDto;

import javax.swing.*;

public class AdminMainTest {
    public static void main(String[] args) {

        AdminController adminController=new AdminController();

        //CREATE
        String adi,soyadi;
        adi= JOptionPane.showInputDialog("Adınızı gitiniz");
        soyadi= JOptionPane.showInputDialog("soyadi gitiniz");
        AdminDto adminDto= AdminDto.builder().name(adi).surname(soyadi).build();
        adminController.create(adminDto);

    }
}
