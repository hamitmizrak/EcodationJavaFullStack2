package com.hamitmizrak.database.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

public class RegisterDto {
    private Long registerId;

    @NotEmpty(message = "Kullanıcı adını boş geçemezsiniz")
    private String userName;

    @NotEmpty(message = "Kullanıcı şifresini boş geçemezsiniz")
    private String userPassword;

    @NotEmpty(message = "Kullanıcı emailini boş geçemezsiniz")
    @Email(message = "Uygun formatta mail girmediniz exam: deneme@gmail.com")
    private String userEmailAddres;

    @NotEmpty(message = "Kullanıcı mesaj boş geçemezsiniz")
    @Size(min=1,max=250)
    private String userMessager;

    private String creationDate=getNowDate();

    private String getNowDate() {
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",locale);
        String changeDate=simpleDateFormat.format(new Date(System.currentTimeMillis()));
        return changeDate;
    }
}
