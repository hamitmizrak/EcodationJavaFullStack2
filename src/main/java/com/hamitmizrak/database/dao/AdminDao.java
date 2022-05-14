package com.hamitmizrak.database.dao;

import com.hamitmizrak.database.dto.AdminDto;
import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    //statement
    //preparentStatement  ? = bana burda bir şey gelecek bende bunu ekliyeceğim
    @Override
    public void update(AdminDto adminDto) {
        try (Connection connection = getInterfaceConnection()) {
            //SQL: update admin set name="Hamit44",surname="Mızrak" where id=1;
            String sql = "update admin set name=?,surname=? where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,adminDto.getName());
            preparedStatement.setString(2,adminDto.getSurname());
            preparedStatement.setLong(3,adminDto.getAdminId());
            int rowEffected=  preparedStatement.executeUpdate();
            if(rowEffected>0){
                log.info("AdminDao Güncelleme Başarılı");
            }else{
                log.error("AdminDao Güncelleme Başarısız...");
            }

        } catch (Exception e) {
            log.error(AdminDao.class + "  Ekleme sırasında hata meydana geldi");
            e.printStackTrace();
        }
    }

    @Override
    public void delete(AdminDto adminDto) {
        try (Connection connection = getInterfaceConnection()) {
            //delete from admin where id=3;
            String sql = "delete from admin where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
           preparedStatement.setLong(1,adminDto.getAdminId());
            int rowEffected=  preparedStatement.executeUpdate();
            if(rowEffected>0){
                log.info("AdminDao Silme Başarılı");
            }else{
                log.error("AdminDao Silme Başarısız...");
            }
        } catch (Exception e) {
            log.error(AdminDao.class + "  Silme sırasında hata meydana geldi");
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<AdminDto> list() {
        ArrayList<AdminDto> listem=new ArrayList<>();
        AdminDto adminDto;
        try (Connection connection = getInterfaceConnection()) {
            //select * from admin;
            String sql = "select * from admin";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet resultSet= preparedStatement.executeQuery();
            while(resultSet.next()){
                adminDto=new AdminDto();
                adminDto.setAdminId(resultSet.getInt("id"));
                adminDto.setName(resultSet.getString("name"));
                adminDto.setSurname(resultSet.getString("surname"));
                adminDto.setCreatedDate(resultSet.getDate("created_date"));
                listem.add(adminDto);
            }
        } catch (Exception e) {
            log.error(AdminDao.class + "  Silme sırasında hata meydana geldi");
            e.printStackTrace();
        }
        return listem;
    }
}
