package com.hamitmizrak.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeanDto {

    private long id;
    private String beanName;
    private String beanData;
}
