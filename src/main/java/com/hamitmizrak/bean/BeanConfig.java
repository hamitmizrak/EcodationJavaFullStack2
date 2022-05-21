package com.hamitmizrak.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    //@Scope("session")
    public BeanDto beanDto() {
        return BeanDto.builder().beanData("Bean Data 44").beanName("bean adi 44").build();
    }

}
