package javase;

import javax.swing.*;
import java.util.Random;

public class _05_Java {
    //psvm ==> TAB
    public static void main(String[] args) {

        //System
        /*System.out */
        /*System.in*/
//        System.err.println("Hata");
//        System.out.print("Alt satıra  geçmemek\n");
//        System.out.println("Alt satıra  geçmek");

        //System.out.println(Math.random()*5+1);
        Random random=new Random();

        int rastgele=random.nextInt(5)+1;
        //System.out.println(rastgele);

        //boxing: primitive Wrapper çevirmek
        int primitive=44;
        Integer wrapper=primitive;

        //casting:String'i int çevir
        String sayi="44";
        int castSayi1=Integer.valueOf(sayi);
        int castSayi2=Integer.parseInt(sayi);
        System.out.println(sayi+16);
        System.out.println(castSayi1+16);
        System.out.println(castSayi2+16);

        System.out.println("++++++++++++++++++");
        //casting:int'i  String'e çevir
        int sayi2=44;
        String castKelime1=String.valueOf(sayi2);
        String castKelime2=Integer.toString(sayi2);
        System.out.println(castKelime1+16);
        System.out.println(castKelime2+16);


    }
}
