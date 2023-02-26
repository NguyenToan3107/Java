package string;

import java.util.Arrays;

public class Vd1 {
     public static void main(String[] args) {
    	 // y 1
		String S_input = "Lap trinh Java trong don gian";
		String a[] = S_input.split(" ");
		System.out.println(Arrays.toString(a));
//		S_input = S_input.replaceAll("a", "");
//		System.out.println(S_input.toString());
		
		String b[] = new String[a.length];
		for (int i = a.length; i > 0; i--) {
			b[b.length - i] = a[i - 1]; 
			
		}
		System.out.println(Arrays.toString(b));
		// dao nguoc chuoi voi string buffer
		String S_output = new StringBuffer(S_input).reverse().toString();
		
		
		
		System.out.println(S_output.toString());
		
	}
}
