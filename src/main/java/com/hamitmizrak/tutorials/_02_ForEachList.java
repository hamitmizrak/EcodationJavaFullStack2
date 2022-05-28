package com.hamitmizrak.tutorials;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log4j2
public class _02_ForEachList {
    public static void main(String[] args) {

        List<String> listem=new ArrayList<String>();
        listem.add("malatya");
        listem.add("istanbul");
        listem.add("ankara");
        listem.add("izmir");
        listem.add("bolu");
        listem.add("nevsehir");
        listem.forEach(System.out::println);







    }
}
