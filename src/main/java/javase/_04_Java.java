package javase;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class _04_Java {
    //psvm ==> TAB
    public static void main(String[] args) {
//        Scanner klavye=new Scanner(System.in);
//        System.out.println("Bir sayı giriniz");

        String adi = JOptionPane.showInputDialog("Lütfen bir yazı giriniz");
        System.out.println(adi.length());
        System.out.println(adi.trim().length());
        System.out.println(adi.startsWith("J"));
        System.out.println(adi.endsWith(" "));

        System.out.println(adi.toUpperCase());
        System.out.println(adi.toLowerCase());
        System.out.println(adi.substring(1));
        System.out.println(adi.substring(1, 3)); //1<=X<4
        System.out.println(adi.concat("Sonuna ekle"));//ekleme
        System.out.println(adi.charAt(0));
        System.out.println(adi.indexOf("Java"));
        System.out.println(adi.lastIndexOf("Java"));
        System.out.println(adi.replace(adi,"Java Jsp Java JSF"));
    }
}
