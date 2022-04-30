package javase;


import java.util.Arrays;

public class _13 {
    public static void main(String[] args) {
        //diziler: eğer veriler belirli ise kullanırız
        //collection: dizilerde eleman sayısı belirli değilse
        int [] dizi2={14,12,44,56};
        //System.out.println(dizi2[0]);

        //iterative for
        for (int i = 0; i <dizi2.length ; i++) {
            System.out.print(dizi2[i]+" ");
        }
        System.out.println("\n*******************");
        Arrays.sort(dizi2);
        //forEach döngüsü
        for( int temp  : dizi2){
            System.out.print(temp+" ");
        }
    }
}
