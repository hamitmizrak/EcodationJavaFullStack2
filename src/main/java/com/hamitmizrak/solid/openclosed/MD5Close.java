package com.hamitmizrak.solid.openclosed;

public class MD5Close  implements IHashingPassword{

    @Override
    public String hashingAlgoritm(String password) {
        return "MD5";
    }

    @Override
    public String blockchain(String blockchain) {
        return "blockchain-2"+blockchain;
    }
}
