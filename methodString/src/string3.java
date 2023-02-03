
public class string3 {
    public static void main(String[] args) {
		String s1 = "Xin chao co chu, xin chao cac ban. Xin chao !";
		String s2 = "Xin chao";
		String s3 = "Xin chao 123";
		char c1 = 'o';
		
		// Ham indexOf
		System.out.println("Vu tri cua s2 trong s1 la: "+ s1.indexOf(s2));
		System.out.println("Vu tri cua s3 trong s1 la: "+ s1.indexOf(s3));
	
        // Su dung vi tri bat dau
		System.out.println("Vu tri cua s2 trong s1 la: "+ s1.indexOf(s2, 2));
        
		// Tim kiem char
		System.out.println("Vu tri cua s2 trong c1 la: "+ s1.indexOf(c1));
        
		
		// Ham lastIndexOf => tim kiem tu phai sang trai
		System.out.println("Vu tri cua s2 trong s1 la(lastIndexOf): "+ s1.lastIndexOf(s2));
    }
}
