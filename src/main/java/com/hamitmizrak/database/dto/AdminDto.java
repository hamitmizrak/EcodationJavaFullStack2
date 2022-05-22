package com.hamitmizrak.database.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminDto {
    private long adminId;
    private String name;
    private String surname;
    private Date createdDate;

    public AdminDto(long adminId, String name, String surname) {
        this.adminId = adminId;
        this.name = name;
        this.surname = surname;
    }
}
