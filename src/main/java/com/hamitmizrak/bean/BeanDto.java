package com.hamitmizrak.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

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

    public void initialBeanMethod() {
        log.info("BeanDto Bean Yaşadı");
        System.out.println("BeanDto Bean Yaşadı");
    }

    public void destroyBeanMethod() {
        log.info("BeanDto Bean Öldü");
        System.out.println("BeanDto Bean Öldü");
    }


//    @Autowired
//    Logger logger;
//
//    @PostConstruct
//    public void init(){
//        logger.info("Message");
//    }
//
//    public static void main(String[] args) {
//        BeanDto beanDto = new BeanDto();
//        System.out.println(beanDto);
//       //beanDto.init();
//
//    }

}
