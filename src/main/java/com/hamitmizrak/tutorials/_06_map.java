package com.hamitmizrak.tutorials;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class _06_map {


    public static void main(String[] args) {

        List<String> listem55=new ArrayList<String>();
        listem55.add("malatya");
        listem55.add("malatya");
        listem55.add("malatya");
        listem55.add("malatya");
        listem55.add("malatya");
        listem55.add("malatya");
        listem55.add("istanbul");
        listem55.add("ankara");
        listem55.add("izmir");
        listem55.add("bolu");
        listem55.add("nevsehir");

        //List<String> yeniListem=listem55.stream().sorted().collect(Collectors.toList());
        List<String> yeniListem=
                listem55
                        .stream()
                        //.map( (temp)->temp.concat(".44") )
                        .map( (temp)->temp.toUpperCase())
                        .collect(Collectors.toList());
        yeniListem.forEach(System.out::println);

    }
}
