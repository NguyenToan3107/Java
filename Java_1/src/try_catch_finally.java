import java.util.Scanner;

public class try_catch_finally {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		try {
			System.out.println("Nhap vao n: ");
			n = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Data not found");
		}
		finally {
			System.out.println("-----");
		}
	}
}
