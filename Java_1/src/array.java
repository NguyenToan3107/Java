import java.util.Scanner;

public class array {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double arr[];
		
		int n;
		System.out.println("Nhap so phan tu cua mang: ");
		n = sc.nextInt();
		arr = new double[n];
		for(int i = 0; i< n; i++) {
			arr[i] = sc.nextDouble();
		}
		double tong = 0.0;
		for(int i =0 ; i<n; i++) {
			tong += arr[i];
		}
		System.out.println(tong);
	}
}
