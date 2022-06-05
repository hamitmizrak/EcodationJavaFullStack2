package com.hamitmizrak.solid.openclosed;

public class _2_OpenClosed_Yanlis {

    //SHA-0 SHA-2 SHA-3
    public static String hashingAlgoritm(String password, String hasingType){
        if("Base64".equals(hasingType)){
            System.out.println("Base-64");
            return "Base 64 yazıldı";
        }else if("MD5".equals(hasingType)){
            System.out.println("MD5");
        }
        return "MD5 yazıldı";
    }

    public static void main(String[] args) {
        hashingAlgoritm("root","MD5");
    }
}
