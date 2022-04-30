package javase;


public class _11_Java {

    public static void main(String[] args) {
        try {
            int sayi=10/0;
            System.out.println(sayi);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Burası ne olursa olsun çalışacak");
        }

        System.out.println("Alt satır");
    }
}
