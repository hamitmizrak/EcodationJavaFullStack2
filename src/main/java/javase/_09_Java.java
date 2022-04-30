package javase;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class _09_Java {

    public static void main(String[] args) {

        int sayi = 4;


        if (sayi == 1) {
            System.out.println("sayı 1");
        } else if (sayi == 2) {
            System.out.println("sayı 2");
        } else if (sayi == 3) {
            System.out.println("sayı 3");
        } else if (sayi == 4) {
            System.out.println("sayı 4");
        } else if (sayi == 5) {
            System.out.println("sayı 5");
        } else {
            System.out.println("Farklı sayı");
        }
        System.out.println("*********************************");

        switch (sayi) {
            case 1:
                System.out.println("sayı 1");
                break;
            case 2:
                System.out.println("sayı 2");
                break;
            case 3:
                System.out.println("sayı 3");
                break;
            case 4:
                System.out.println("sayı 4");
                break;
            case 5:
                System.out.println("sayı 5");
                break;
            default:
                System.out.println("Farklı sayı");
                break;
        }
        System.out.println("*********************************");
        //Ternary
        String result = (sayi == 5) ? "Eşit" : "Değil";
        System.out.println(result);

        char c1='a';
        if(Character.isDigit(c1)){
            System.out.println("Sayıdır");
        }else if(Character.isLetter(c1)){
            System.out.println("Harftir");
        }else{
            System.out.println("Özel Simgedir");
        }

    }
}
