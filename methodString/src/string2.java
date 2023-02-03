
public class string2 {
    public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
		
	    // Ham equals => so sanh 2 chuoi giong nhau, co phan biet hoa thuong 
		System.out.println("s1 equals s2: "+ s1.equals(s2));
		System.out.println("s1 equals s3: "+ s1.equals(s3));
		
		// ham equalsIgnoreCase, so sanh ko phan biet hoa thuong
		System.out.println("s1 equalsIgnoreCase s2: "+ s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: "+ s1.equalsIgnoreCase(s3));
    
		// Ham compareTo => so sanh > < =
		String sv1 = "Nguyen Van A";
		String sv2 = "Nguyen Van B";
		String sv3 = "Nguyen Van";
		String sv4 = "Nguyen Van A";
		
		System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: "+sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: "+sv1.compareTo(sv4));
		
		// Ham compareToIgnoreCase => tuong tu compareTo, ko pb hoa thuong
		
		// regionMatches => so sanh 1 doan
		String r1 = "TITV.vn";
		String r2 = "TV.vn";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		
		// Ham startWith => kiem tra chuoi bat dau bang ....
		String sdt = "037123943005";
		System.out.println(sdt.startsWith("037"));
		
		// Ham endWith =? ham ktra chuoi ket thuc bang....
		
		String tenFile = "I love you.JPG";
		String tenFile2 = "Hoc JAVA.PDF";
		
		String check1 = tenFile2.endsWith(".JPG") ? "File la 1 h/a" : "File la 1 PDF";
		System.out.println(check1);
    }
}
