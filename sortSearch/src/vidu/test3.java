package vidu;

import java.util.Arrays;

public class test3 {
    // split : string to array
	public static void main(String[] args) {
		String s = "xin chao cac ban, minh la toan";
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String s2 = "Xin chao, minh la Peter. Minh la lap trinh vien!";
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
		
		String s3 = "Nguyen Tien Toan";
		String[] d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		System.out.println("d: "+d[d.length - 1]);
		
	}
}
