package pratice1;

import java.util.Scanner;

public class Vd3{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	// Khoi tao gia tri
    	int n = 5;
//    	System.out.println("Nhap n: "); n = sc.nextInt();
    	
    	float S = 1;
    	float x = 4;
    	
		
		// tinh tong
		float sum = tong(n, S, x);
		
		System.out.println("Tong S = "+sum);
	}

    // tinh tong
	private static float tong(int n, float S, float x) {
		int m = 1;
		for (int i = 1; i <= n; i++) {
			m = m*(n - i + 1);
			S += (float)(m * Math.pow(x, i)) / giaiThua(i);
		}
		return S;
	}
  
    // giai thua
	private static int giaiThua(int n) {
		int giaiThua = 1;
		for (int i = 1; i <= n; i++) {
			giaiThua*=i;
		}
		return giaiThua;
	}
	
}