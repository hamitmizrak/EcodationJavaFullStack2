package com.hamitmizrak.abstractx;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MsiAbstract extends ComputerAbstract {

    private String msiSpecialData;

    public MsiAbstract() {
    }

    public MsiAbstract(String computerName, String computerTrade, double computerPrice, String msiSpecialData) {
        super(computerName, computerTrade, computerPrice);
        this.msiSpecialData = msiSpecialData;
    }

    @Override
    public String toString() {
        return "Msi{" +
                "msiSpecialData='" + msiSpecialData + '\'' +
                "} " + super.toString();
    }


    @Override
    public void govdesizMethod() {
        System.out.println("Msi govdesiz Method");
    }
}
