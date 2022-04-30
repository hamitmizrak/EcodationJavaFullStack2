package javase;

public class _02_Java {
    //psvm ==> TAB
    public static void main(String[] args) {

        int sayi1, sayi2, toplam = 0;
        sayi1 = 10;
        sayi2 = 20;
        toplam = (sayi2 / sayi1);
        System.out.println(toplam);
        double bilimsel=42E+4;
        System.out.println(bilimsel);

        //primitive type: null veremezsiniz
        //Wrapper
        //int kelime=null;
        Integer kelime2=null;

        //Error
        //Syntax error
        //doouble d55; //syntax error

        //logic error
       // int sayi66=6/0; //infinity
       // System.out.println(sayi66);

        int telefon=11_22_33_44_55;
        System.out.println(telefon);

        int ikilik=0b0001;
        int onalatilik=0xABF0;
        int sekizlik=00777;

        int derece=100;
        int fahrenhayt=derece*9/5+32;
        System.out.println(fahrenhayt);


    }
}
