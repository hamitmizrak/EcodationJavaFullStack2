package com.hamitmizrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//exclude:dahil etmemek
/*@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)*/
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled","true");
        System.setProperty("java.awt.headless", "false"); //Disables headless
        SpringApplication.run(Application.class, args);
    }
}
