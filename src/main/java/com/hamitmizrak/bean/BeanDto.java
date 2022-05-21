package com.hamitmizrak.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class BeanDto {

    private long id;
    private String beanName;
    private String beanData;

    public void initialBeanMethod(){
        log.info("BeanDto Bean Başladı");
        System.out.println("BeanDto Bean Başladı");
    }

}
