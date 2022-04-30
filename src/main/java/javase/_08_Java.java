package javase;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class _08_Java {

    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getMonth());
        System.out.println(date.getMinutes());
        System.out.println(date.getYear()+1900);

        System.out.println("**************************");
        Locale locale=new Locale("tr","TR");
        //SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss",locale);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",locale);
        String data=simpleDateFormat.format(date);
        System.out.println(data);
        System.out.println(new Date(System.currentTimeMillis()));
        System.out.println("**************************");

        Calendar calendar=Calendar.getInstance();
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        System.out.println("Takvim: "+simpleDateFormat.format(calendar.getTime()));
    }
}
