package javase;

import java.util.StringTokenizer;

public class _07_Java {

    public static void main(String[] args) {
        String kelime1="Html5 Css3+ JS& Jquery~ Java-SE,asd JDBC";

        //1.YOL
        String[] splitData=kelime1.split(" ");
        for ( String temp  : splitData){
            System.out.println(temp);
        }
        System.out.println("*******************");

        //2.YOL
        StringTokenizer tokenizer=new StringTokenizer(kelime1,"+~, ");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }
}
