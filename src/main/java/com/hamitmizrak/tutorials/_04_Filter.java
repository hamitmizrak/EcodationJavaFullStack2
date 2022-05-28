package com.hamitmizrak.tutorials;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class _04_Filter {
    public static void main(String[] args) {

        List<String> listem=new ArrayList<String>();
        listem.add("malatya");
        listem.add("malatya");
        listem.add("malatya");
        listem.add("malatya");
        listem.add("malatya");
        listem.add("malatya");
        listem.add("istanbul");
        listem.add("ankara");
        listem.add("izmir");
        listem.add("bolu");
        listem.add("nevsehir");

        //List<String> yeniListem=listem.stream().sorted().collect(Collectors.toList());
        List<String> yeniListem=
                listem
                        .stream()
                        //.filter( (temp)->"malatya".equals(temp))
                        .filter( (temp)->"malatya".equals(temp))
                        //.filter( (temp)->!"malatya".equals(temp))
                        .collect(Collectors.toList());
        yeniListem.forEach(System.out::println);

    }
}
