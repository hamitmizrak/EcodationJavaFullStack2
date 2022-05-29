package com.hamitmizrak.project.mvcdata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class _1_CustomerDto {
    private Long customerId;
    private String customerName;
    private String customerSurname;
    private String customerHesCode;
}
