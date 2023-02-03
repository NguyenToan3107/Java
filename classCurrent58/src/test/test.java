package test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
    	// ham lay thoi gian chay
		long t1 = System.currentTimeMillis();
//		for(int i = 0; i < 100; i++) {
//			System.out.println("Test");
//		}
        long t2 = System.currentTimeMillis();
        System.out.println("Truoc khi chay: "+t1);
        System.out.println("Sau khi chay: "+t2);
        System.out.println("Thoi gian chay: "+ (t2-t1) +"mls");
        System.out.println("Thoi gian chay: "+ (t2-t1)/1000 +"s");
        
        // TimeUnit
        // lay ten class ra su dung luon
        System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000*365)+"s");
        System.out.println("25h = "+TimeUnit.HOURS.toSeconds(25) +"s");
        System.out.println("3600s = "+TimeUnit.SECONDS.toHours(3600)+"h");
        System.out.println("25h = "+ TimeUnit.HOURS.toDays(25)+" day");
        
        // Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
        
        // Calendar
        Calendar c = Calendar.getInstance(); // lay ra mui h
        System.out.println(c.get(Calendar.DATE)+" ");
        System.out.println(c.get(Calendar.MONTH)+1+" ");
        System.out.println(c.get(Calendar.YEAR)+" ");
        
        c.add(Calendar.HOUR, 30);
        c.add(Calendar.DATE, 14);
        
        
        // DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));
        
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));
	}
}  
