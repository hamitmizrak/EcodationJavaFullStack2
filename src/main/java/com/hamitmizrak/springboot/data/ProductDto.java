package com.hamitmizrak.springboot.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import javax.validation.constraints.NotEmpty;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

public class ProductDto {
    private Long productId;

    @NotEmpty(message = "Kullanıcı adını boş geçemezsiniz")
    private String productName;

    @NotEmpty(message = "Kullanıcı şifresini boş geçemezsiniz")
    private String productTrade;
}


