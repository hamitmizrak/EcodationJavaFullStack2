package com.hamitmizrak.solid.openclosed;

public class Base64Close implements  IHashingPassword {
    @Override
    public String hashingAlgoritm(String password) {
        return "Base64";
    }

    @Override
    public String blockchain(String blockchain) {
        return "blockchain-1"+blockchain;
    }



}
