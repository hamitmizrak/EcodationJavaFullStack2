package com.hamitmizrak.database.controller;

import com.hamitmizrak.database.dao.AdminDao;
import com.hamitmizrak.database.dao.IDaoConnection;
import com.hamitmizrak.database.dto.AdminDto;

import java.util.ArrayList;

public class AdminController implements IDaoConnection<AdminDto> {
    AdminDao adminDao;

    public AdminController() {
        adminDao = new AdminDao();
    }

    @Override
    public void create(AdminDto adminDto) {
        this.adminDao.create(adminDto);
    }


    @Override
    public void update(AdminDto adminDto) {
        this.adminDao.update(adminDto);
    }

    @Override
    public void delete(AdminDto adminDto) {
        this.adminDao.delete(adminDto);
    }

    @Override
    public ArrayList<AdminDto> list() {
        return null;
    }
}
