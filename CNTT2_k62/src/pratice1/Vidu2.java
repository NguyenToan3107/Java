package pratice1;

public class Vidu2 {
    public static void main(String[] args) {
    	// Khai bao bien
		int a[] = {1, 3, 8, 6, 4, -31, 21};
		int S = 0;
		S = sum(a, S);
		
		// Xuat du lieu
		System.out.println("S = "+S);
		System.out.println("Max = "+max(a));
	}

	private static int sum(int[] a, int S) {
		for (int i : a) {
			S += i;
		}
		return S;
	}
	public static int max(int a[]) {
		int max_a = a[0];
		for (int i : a) {
			if(max_a < i) {
				max_a = i;
			}
		}
		return max_a;
	}
}
