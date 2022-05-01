package com.hamitmizrak.aynipaket.kalitim;

public class Computer {
    private String computerName;
    private String computerTrade;
    private double computerPrice;

    public Computer() {
    }

    public Computer(String computerName, String computerTrade, double computerPrice) {
        this.computerName = computerName;
        this.computerTrade = computerTrade;
        this.computerPrice = computerPrice;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerName='" + computerName + '\'' +
                ", computerTrade='" + computerTrade + '\'' +
                ", computerPrice=" + computerPrice +
                '}';
    }

    public String getComputerName() {
        return computerName;
    }

    public Computer setComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    public String getComputerTrade() {
        return computerTrade;
    }

    public Computer setComputerTrade(String computerTrade) {
        this.computerTrade = computerTrade;
        return this;
    }

    public double getComputerPrice() {
        return computerPrice;
    }

    public Computer setComputerPrice(double computerPrice) {
        this.computerPrice = computerPrice;
        return this;
    }
}
