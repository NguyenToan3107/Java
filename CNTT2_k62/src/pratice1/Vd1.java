package pratice1;

import java.util.Scanner;

public class Vd1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
//    	pt bac 2: ax2 + bx + c = 0
    	
		float x, x1, x2, delta;
		
		float a, b, c;
		System.out.println("Nhap a: "); a = sc.nextFloat();
		System.out.println("Nhap b: "); b = sc.nextFloat();
		System.out.println("Nhap c: "); c = sc.nextFloat();
		
		if(a == 0) {
			if(b == 0) {
				System.out.println("PT vo no.");
			}else {
				x = - c / b;
				System.out.println("PT co no duy nhat: x = "+x);
			}
		}else {
			// pt co 2 no
			delta = b*b - 4*a*c;
			if(delta == 0 ) {
				x1 = x2 = (float)-b / (2*a);
				System.out.println("PT co no kep (x1 = x2 = x): x = "+x1);
			}else if(delta > 0) {
				x1 = (float)(-b + Math.sqrt(delta)) / (2*a);
				x2 = (float)(-b - Math.sqrt(delta)) / (2*a);
				System.out.println("PT co no kep: ");
				System.out.println("x1 = "+ x1 + ", x2 = "+x2);
			}else {
				System.out.println("PT vo no.");
			}
		}
		
	}
}
