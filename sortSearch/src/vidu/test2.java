package vidu;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
    	Sinhvien sv1 = new Sinhvien(100, "Toan A", "12A3", 8);
    	Sinhvien sv2 = new Sinhvien(150, "Toan G", "12A3", 9);
    	Sinhvien sv3 = new Sinhvien(50, "Toan B", "12A3", 9);
    	
    	Sinhvien[] a_sv = new Sinhvien[]{sv1, sv2, sv3};
    	
    	System.out.println("Ban dau: "+ Arrays.toString(a_sv));
    	// ham sap xep
    	Arrays.sort(a_sv);
    	System.out.println("sau dau: "+ Arrays.toString(a_sv));
    	
    	// tim kiem
    	System.out.println("Tim kiem Toan A: "+ Arrays.binarySearch(a_sv, sv3));
	}
}
