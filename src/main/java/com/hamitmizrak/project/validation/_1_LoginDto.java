package com.hamitmizrak.project.validation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class _1_LoginDto {

    private Long loginId;

    @NotEmpty(message="Email alanı boş geçemezsiniz")
    @Email(message="Uygun Formatta Email girmediniz example: deneme@xyz.com")
    private String loginEmail;

    @NotEmpty(message="password alanı boş geçemezsiniz")
    private String loginPassword;
}
