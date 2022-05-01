package javase;

public class _15_Formatter {

    public static void main(String[] args) {
//        System.out.println("Deneme Merhabalar    Nasılsın");
//        System.out.println("Deneme Merhabalar Nasılsın");

        //SeDeF
        String string=" Merhabalar Nasılsınız Java Dersleri";
        int decimal=44;
        float virgullu=55.555f;
        System.out.println(string+decimal+virgullu);
        System.out.printf("%30s  %d  %f",string,decimal,virgullu);

        //super: üst atadaki datalara erişmek için kullanırız
        //this : global değişkenlerde , constructor

    }
}
