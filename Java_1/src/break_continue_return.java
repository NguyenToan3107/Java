
public class break_continue_return {
    public static void main(String[] args) {
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=10; j++) {
				if(j>5) return;
				System.out.println(i+" x "+j+" "+(i*j));
			}
			System.out.println("-------");
		}
		System.out.println("ABC");
	}
}
