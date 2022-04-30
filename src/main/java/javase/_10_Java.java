package javase;


public class _10_Java {

    public static void main(String[] args) {

        int toplam=0,whileToplam=0;
        for (int i = 1; i <=10 ; i++) {
            toplam+=i;
        }
        System.out.println(toplam);

        System.out.println("***************************");

        //While
        int baslangic=1;
        while(baslangic<=10){
            whileToplam+=baslangic;
            baslangic++;
        }
        System.out.println(whileToplam);

        int doWhileCounter=0;
        //do-while
        do{
            System.out.print(doWhileCounter+" ");
            doWhileCounter++;

        }while(doWhileCounter<=10);

    }
}
