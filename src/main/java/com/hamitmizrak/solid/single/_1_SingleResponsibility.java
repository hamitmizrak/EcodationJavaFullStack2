package com.hamitmizrak.solid.single;

public class _1_SingleResponsibility {

  /*  //YANLIS
    public void send(){
        System.out.println( "sms gönderildi");
        System.out.println( "mail gönderildi");
        System.out.println( "db yazıldı");
    }*/

    public void send(){
        smsSend();
        mailSend();
        dbSend();
    }

    public void smsSend() {
        System.out.println("sms gönderildi");
    }

    public void mailSend() {
        System.out.println("mail gönderildi");
    }

    public void dbSend() {
        System.out.println("db yazıldı");
    }
}
