package javase;

public class _06_Java {

    public static void main(String[] args) {
        //1.YOL
        String kelime1="Java1 ",kelime2="Java2 ",kelime3="Java3 ";
        String result=kelime1+  kelime2+ kelime3;
        System.out.println(result);
        System.out.println("**************************");

        //2.YOL
        String result2=kelime1.concat(kelime2).concat(kelime3);
        System.out.println(result2);

        //3.YOL
        System.out.println("**************************");
        StringBuilder builder = new StringBuilder();
        builder.append(kelime1).append(kelime1).append(kelime1);
        String format = builder.toString();
        System.out.println(format);

    }
}
