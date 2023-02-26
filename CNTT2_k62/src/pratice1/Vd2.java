package pratice1;

public class Vd2 {
    public static void main(String[] args) {
		// phan tu thu n
		int n = 5;
		
		// gia tri can tim
	 	int fn = Fibonacci(n);
		System.out.println(fn);
		
		// tim phan tu gan nhat voi n
        int y2 = (fn - Fibonacci(n - 1)) < (Fibonacci(n + 1) - fn) ? Fibonacci(n - 1) : Fibonacci(n + 1);
        
        System.out.println(y2);
	}
    private static int Fibonacci(int n) {
    	// gia tri ban dau
    	int F1 = 1;
    	int	F2 = 1;
    	
    	if(n == 0 || n == 1) return n;
    	return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
