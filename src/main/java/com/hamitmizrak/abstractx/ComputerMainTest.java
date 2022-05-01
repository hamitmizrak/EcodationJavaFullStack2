package com.hamitmizrak.abstractx;

public class ComputerMainTest {
    public static void main(String[] args) {

        ComputerAbstract msi2=new MsiAbstract();//polymorphism
       // MsiAbstract msi2=new MsiAbstract();
        msi2.setComputerName("msi Axs545");
        msi2.setComputerPrice(15000);
        msi2.setComputerTrade("msi");
        //msi2.setMsiSpecialData("Msi Ekran kartı");
        msi2.govdesizMethod(); //polymorphism
        System.out.println(msi2);

        System.out.println("***************");

        AsusAbstract asus2=new AsusAbstract();
        asus2.setComputerName("asus Axs545");
        asus2.setComputerPrice(16000);
        asus2.setComputerTrade("asus");
        asus2.govdesizMethod();//polymorphism
        System.out.println(asus2);

    }
}
