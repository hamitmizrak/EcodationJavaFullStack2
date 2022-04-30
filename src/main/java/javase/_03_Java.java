package javase;

import java.util.Scanner;

public class _03_Java {
    //psvm ==> TAB
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=klavye.nextInt();
        System.out.println(sayi+" sayısınının karekökü: \" "+ Math.round(Math.sqrt(sayi)) );

        //escape character: \
        //Math


    }
}
