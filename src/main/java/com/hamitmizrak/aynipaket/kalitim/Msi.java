package com.hamitmizrak.aynipaket.kalitim;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Msi extends Computer {

    private String msiSpecialData;

    public Msi() {
    }

    public Msi(String computerName, String computerTrade, double computerPrice, String msiSpecialData) {
        super(computerName, computerTrade, computerPrice);
        this.msiSpecialData = msiSpecialData;
    }

    @Override
    public String toString() {
        return "Msi{" +
                "msiSpecialData='" + msiSpecialData + '\'' +
                "} " + super.toString();
    }


}
