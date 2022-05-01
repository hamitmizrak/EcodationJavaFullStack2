package com.hamitmizrak.aynipaket.kalitim;

public class ComputerMainTest {
    public static void main(String[] args) {

        Computer computer=new Computer();

        Msi msi2=new Msi();
        msi2.setComputerName("msi Axs545");
        msi2.setComputerPrice(15000);
        msi2.setComputerTrade("msi");
        msi2.setMsiSpecialData("Msi Ekran kartı");
        System.out.println(msi2);

        System.out.println("***************");

        Asus asus2=new Asus();
        asus2.setComputerName("asus Axs545");
        asus2.setComputerPrice(16000);
        asus2.setComputerTrade("asus");
        System.out.println(asus2);

    }
}
