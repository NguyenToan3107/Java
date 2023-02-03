import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s;
		System.out.println("Nhap chuoi: ");
		s = sc.nextLine();
		System.out.println("__________");
		
		// ham length() => lay do dai chuoi
		System.out.println(s.length());
		int dodai = s.length();
		
		// ham charAt(vi tri) => lay ra 1 ky tu tai vi tri
		for(int i = 0; i < dodai; i++) {
			System.out.println("Vi tri "+i+" la "+s.charAt(i));
		}
		// ham getChars(vi tri bat dau, vi tri ket thuc, 
		// mang luu du lieu, vi tri bat dau luu cua mang)
		char[] arrChar = new char[100];
		s.getChars(0, 4, arrChar, 3);
//		for(int i = 0; i < arrChar.length; i++) {
//			System.out.println("Gia tri cua mang tai "+i+" la "+arrChar[i]);
//		}
	    System.out.println(arrChar);
	    
	    
	    // ham getBytes => cos 3 cach, lay ra gia tri cua cac ki tu thanh 1 mang
	    byte[] arrayBytes = s.getBytes();
	    for (byte b : arrayBytes) {
			System.out.println(b);
		}
	}
}
