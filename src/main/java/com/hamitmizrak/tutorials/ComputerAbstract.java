package com.hamitmizrak.tutorials;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
 abstract public class ComputerAbstract {
    private String computerName;
    private String computerTrade;
    private double computerPrice;

    abstract  public  void govdesizMethod();

    public void govdeliMethod(){
        System.out.println("govdeliMethod");
    }
}
