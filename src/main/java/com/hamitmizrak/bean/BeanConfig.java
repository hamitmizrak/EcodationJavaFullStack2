package com.hamitmizrak.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDto() {
        return BeanDto.builder().beanData("Bean Data 44").beanName("bean adi 44").build();
    }

}
