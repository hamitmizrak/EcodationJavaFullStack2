package javase;

public class _14_Method {

    public void voidliParametresiz() {
        System.out.println("voidli Parametresiz");
    }

    public static void voidliParametreli(String adi) {
        System.out.println("voidli Parametreli " + adi);
    }

    public static String voidsizParametresiz() {
        return "voidsiz Parametresiz ";
    }

    public static String voidsizParametreli(String soyadi) {
        return "voidsiz Parametreli " + soyadi;
    }

    //aynı metot ismindeki verilere: @Overloading:Aşırı yükleme
    //sayac: parametre
    public static String voidsizParametreli(int sayac) {
        return "voidsiz Parametreli " + sayac;
    }

    public static void main(String[] args) {
        //instance
        _14_Method method = new _14_Method();
        method.voidliParametresiz();

        //static
        //Argüman: "Hamit"
        voidliParametreli("Hamit");
       //overloading
        voidsizParametreli(14);

        //static return
        String deneme1 = voidsizParametresiz();
        System.out.println(deneme1);

        //static return
        String deneme2 = voidsizParametreli("Mızrak");
        System.out.println(deneme2);
    }


}
