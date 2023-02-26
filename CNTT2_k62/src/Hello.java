import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Hello world!");
		int n = 5;
		int arr[] = new int[n];
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap ptu thu: "+i);
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(i+" ");
		}
	}
}
