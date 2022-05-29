package com.hamitmizrak.project.mvcdata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class _1_CustomerDto {

    private Long customerId;

    @NotEmpty(message = "Adı boş geçilemez")
    private String customerName;

    @NotEmpty(message = "Soyadı boş geçilemez")
    private String customerSurname;

    @NotEmpty(message = "HesCode boş geçilemez")
    private String customerHesCode;

    private Date createdDate;
}
