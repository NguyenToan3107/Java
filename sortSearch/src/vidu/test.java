package vidu;

import java.util.Arrays;

public class test {
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index=0;
		for(int i = x.length - 1; i>=0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	
    public static void main(String[] args) {
		int[] a = new int[] {1, 8, 2, 6, 4, 3, 7, 9};
		int[] b = new int[15];
		System.out.println("a ban dau: "+ Arrays.toString(a));
		// ham sap xep tang dan
		Arrays.sort(a);
		System.out.println("a sau ban dau: "+Arrays.toString(a));
		// ham tim kiem 
		System.out.println(Arrays.binarySearch(a, 7));
		System.out.println(Arrays.binarySearch(a, -4));
		
		// ham dien gia tri
		Arrays.fill(b, 5);
		System.out.println("b sau ban dau: "+Arrays.toString(b));
		
		// ham sap xep giam dan
		
		Arrays.sort(a);
		a = test.reverse(a);
		System.out.println(Arrays.toString(a));
	}
}
