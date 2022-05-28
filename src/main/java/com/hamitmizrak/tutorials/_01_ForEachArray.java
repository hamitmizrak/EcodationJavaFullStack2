package com.hamitmizrak.tutorials;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;

@Log4j2
public class _01_ForEachArray {
    public static void main(String[] args) {
        String [] dizi={"malatya","istanbul","ankara","izmir","bolu","nevsehir"};

        //1.iterative
        for (int i = 0; i <dizi.length ; i++) {
            log.info(dizi[i]);
        }
        System.out.println("***********************************");

        //2.special For
        for(String temp : dizi  ){
            log.info(temp);
        }

        System.out.println("***********************************");
        //3. Java 8
        Arrays.asList(dizi).stream().forEach(System.out::println);
        System.out.println("***********************************");
        Arrays.asList(dizi).forEach(System.out::println);
    }
}
