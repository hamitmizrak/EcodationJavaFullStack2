package com.hamitmizrak.database.dao;

import com.hamitmizrak.database.dto.AdminDto;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

@Log4j2
public class AdminDao implements IDaoConnection<AdminDto> {


    @Override
    public void create(AdminDto adminDto ) {
        try (Connection connection = getInterfaceConnection()) {
            //SQL: insert into admin(name,surname) values("Hamit","Mızrak");
            String sql = "insert into admin(name,surname) values(?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,adminDto.getName());
            preparedStatement.setString(2,adminDto.getSurname());
          int rowEffected=  preparedStatement.executeUpdate();
          if(rowEffected>0){
              log.info("AdminDao Ekleme Başarılı");
          }else{
              log.error("AdminDao Ekleme Başarısız...");
          }

        } catch (Exception e) {
            log.error(AdminDao.class + "  Ekleme sırasında hata meydana geldi");
            e.printStackTrace();
        }
    }

    @Override
    public void update(AdminDto adminDto) {

    }

    @Override
    public void delete(AdminDto adminDto) {

    }

    @Override
    public ArrayList<AdminDto> list() {
        return null;
    }
}
