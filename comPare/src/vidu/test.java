package vidu;

public class test {
   public static void main(String[] args) {
	Sinhvien sv1 = new Sinhvien(100, "Toan A", "12A3", 8);
	Sinhvien sv2 = new Sinhvien(150, "Toan C", "12A3", 9);
	
	System.out.println(sv1.compareTo(sv2));
}
}
