
public class string4 {
    public static void main(String[] args) {
		String s1 = "tItv";
		String s2 = ".Vn";
		
		String s3 = s1 + s2;
		// Ham concac => noi chuoi
		String s4 = s1.concat(s2);
		System.out.println("s4 = "+ s4);
		
		// Ham replace => thay the
		String s5 = "Tung.vn";
		String s6 = s5.replaceAll("Tung", "TITV");
		System.out.println("s6 = " +s6);
		
	    // Ham toLowerCase => chy ve viet thuong
		// Ham toUpperCase => viet hoa
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		System.out.println(s7 + s8);
		
		// Ham trim() => xoa bo khoang trang dau va cuoi chuoi
		String s9 = " Xin chao cac ban, minh la Toan    ";
		String s10 = s9.trim();
		System.out.println(s10);
		
		// toCharArray => chuyen chuoi va mang
		char[] s11 = s1.toCharArray();
		System.out.println(s11);
		for (int i = 0; i < s11.length; i++) {
			System.out.print(s11[i] + " ");
		}
		
		// Ham subSttring => cat chuoi con
		
		String s12 = "Xin chao cac ban, minh la Toan";
		String s13 = s12.substring(10, 15);
		System.out.println("\n");
		System.out.println(s13);
	}
}
