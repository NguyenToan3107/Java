package string;

import java.util.Arrays;

public class Vd2 {
    public static void main(String[] args) {
    	// khai bao chuoi
		String S_input = "2 34.5 -12.9 0 12 1.98";
		int count = 0; 

		// chuyen chuoi sang mang chuoi
		String a[] = S_input.split(" ");
		System.out.println(Arrays.toString(a));
		
		
		for (String s : a) {
            if(checkFloatNumber(s)) {
                count++;
            }
	    }
		
		// in ra ket qua
		if(count == a.length) {
            System.out.println(true);				
			System.out.println(count);
		}else {
			System.out.println(false);
		}
	}
    
    // kiem tra so thuc
    public static boolean checkFloatNumber(String s) {
    	
    		 String regex = "(^-)*\\d+(.\\d+)*";
    		 if(s.matches(regex)) {
             	return true;
             }else {
            	 return false;
             }
    }
}
