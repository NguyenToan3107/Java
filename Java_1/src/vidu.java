import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ho va ten: ");
		String name = sc.nextLine();
		System.out.println("Nhap ma sinh vien: ");		
		long id = sc.nextLong();
		System.out.println("Nhap vao diem thi: ");
		float score = sc.nextFloat();
		
		System.out.println("------------");
		System.out.println("Ho va ten: "+ name);
		System.out.println("Id: "+ id);
		System.out.println("Score: "+ score);
	}
}
