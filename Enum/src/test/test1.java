package test;

import java.util.Iterator;

public class test1 {
    public static void main(String[] args) {
    	testEnum tkb = new testEnum(day.Monday, "Toan Ly Hoa"); 
        testEnum tkb1 = new testEnum(day.Thursday, "Van Su Dia");
        testEnum tkb2 = new testEnum(day.Wednesday, "LY Hoa Sinh");
        testEnum tkb3 = new testEnum(day.Tuesday, "Tin The Duc GDQP");
        
        System.out.println(tkb1);
        
        // duyet cac gia tri trong enum season
        
        for (Season s : Season.values()) {
			System.out.println(s);
		}
       
	}
    
}
