package com.hamitmizrak.rest;


import com.hamitmizrak.project.mvcdata._1_CustomerDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Log4j2
public class CustomerRest {

    //Rest: defaultta JSON çalışır.
    //manuel json
    //http://localhost:8080/manuel
    @GetMapping("manuel")
    public String manuelJSon() {
        return "{\n" +
                "  \"adi\":\"Hamit\",\n" +
                "  \"soyadi\":\"Mızrak\",\n" +
                "  \"dil\":6,\n" +
                "}";
    }


    //http://localhost:8080/dynamic
    @GetMapping("dynamic")
    public String dynamicsJson() {
        _1_CustomerDto customerDto = _1_CustomerDto
                .builder()
                .customerId(0L)
                .customerName("Müşteri Adı")
                .customerSurname("Müşteri Soyadı")
                .build();
        return customerDto + " ";
    }

    //http://localhost:8080/dynamic2
    @GetMapping(value = "dynamic2")
    public _1_CustomerDto dynamicsJson2() {
        _1_CustomerDto customerDto = _1_CustomerDto
                .builder()
                .customerId(0L)
                .customerName("Müşteri Adı")
                .customerSurname("Müşteri Soyadı")
                .build();
        return customerDto;
    }

    //http://localhost:8080/dynamic3
    @GetMapping(value = "dynamic3", produces = MediaType.APPLICATION_JSON_VALUE)
    public _1_CustomerDto dynamicsJson3() {
        _1_CustomerDto customerDto = _1_CustomerDto
                .builder()
                .customerId(0L)
                .customerName("Müşteri Adı")
                .customerSurname("Müşteri Soyadı")
                .build();
        return customerDto;
    }

    //http://localhost:8080/dynamic4
    @GetMapping(value = "dynamic4", produces = "application/json")
    public _1_CustomerDto dynamicsJson4() {
        _1_CustomerDto customerDto = _1_CustomerDto
                .builder()
                .customerId(0L)
                .customerName("Müşteri Adı")
                .customerSurname("Müşteri Soyadı")
                .build();
        return customerDto;
    }
    /////////////////////

    //PathVariable
    //http://localhost:8080/dynamic4/adim44
    @GetMapping("dynamic4/{adi}")
    public _1_CustomerDto pathVariable(@PathVariable(name = "adi") String adi) {
        _1_CustomerDto customerDto = _1_CustomerDto
                .builder()
                .customerId(0L)
                .customerName(adi)
                .customerSurname("Müşteri Soyadı")
                .build();
        return customerDto;
    }

    //PathVariable
    //http://localhost:8080/dynamic5/2
    //http://localhost:8080/dynamic5
    @GetMapping({"dynamic5", "dynamic5/{id}"})
    @ResponseBody
    public String pathVariable2(@PathVariable(name = "id", required = false) Long id) {
        _1_CustomerDto customerDto = null;
        if (id != null) {
            customerDto = _1_CustomerDto
                    .builder()
                    .customerId(id)
                    .customerName("Müşteri Adı")
                    .customerSurname("Müşteri Soyadı")
                    .build();
            return customerDto + " ";
        } else {
            log.error("İd bulunamadı");
        }
        return "İd bulunamadı";
    }


    //Object List
    //http://localhost:8080/list
    @GetMapping("/list")
    public List<_1_CustomerDto> getListem() {
        List<_1_CustomerDto> listem = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listem.add(
                    _1_CustomerDto
                            .builder()
                            .customerId(Long.valueOf(i))
                            .customerName("adi " + i)
                            .customerSurname("Müşteri Soyadı")
                            .build()
            );
        }
        return listem;
    }

/////////////////////////////////////////////////////
    //Status

    //http://localhost:8080/status1
    @GetMapping(value = "status1")
    public ResponseEntity<_1_CustomerDto>  getStatus() {
        _1_CustomerDto customerDto = _1_CustomerDto.builder().customerId(1L).customerName("Müşteri Adı").customerSurname("Müşteri Soyadı").build();

        //return new ResponseEntity<>(customerDto, HttpStatus.OK);
        //return  ResponseEntity.status(200).body(customerDto);
        //return  ResponseEntity.status(HttpStatus.OK).body(customerDto);
        //return  ResponseEntity.ok().body(customerDto);
        return  ResponseEntity.ok(customerDto);
    }

}
