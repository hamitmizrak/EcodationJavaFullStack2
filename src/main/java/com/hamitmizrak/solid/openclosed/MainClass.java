package com.hamitmizrak.solid.openclosed;

public class MainClass {

    public static void main(String[] args) {
        Base64Close base64Close = new Base64Close();
        System.out.println(base64Close.hashingAlgoritm("base64password"));
        System.out.println(base64Close.blockchain("konsensus PoW"));


        MD5Close md5Close = new MD5Close();
        System.out.println(md5Close.hashingAlgoritm("MD5 "));
        System.out.println(md5Close.blockchain("konsensu PaS"));

    }
}
