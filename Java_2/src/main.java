
public class main {
     public static void main(String[] args) {
		myDate md1 = new myDate(25, 2, 2029);
		myDate md2 = new myDate(25, 3, 2029);
//		md.printDay();
//		md.printMonth();
//		md.printYear();
//		md.printDate();
//    	Coffee co = new Coffee("Toan", 150000, 3);
//    	System.out.println("Tong tien: "+co.sumPrice());
//    	Coffee co1 = new Coffee("", 0, 0);
//    	co1.input();
//    	co1.output();
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md1.equals(md2));
		System.out.println(md1.hashCode());
	}
}
