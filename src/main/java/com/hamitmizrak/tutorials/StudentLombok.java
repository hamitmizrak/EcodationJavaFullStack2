package com.hamitmizrak.tutorials;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //parametreli constructor
@NoArgsConstructor
@Builder
public class StudentLombok {
    private String studentName;
    private String studentSurname;
    private String studentHescode;
}
