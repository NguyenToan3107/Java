package btTrenLop;

public class Pratice1 {
    public static void main(String[] args) {
		// khai bao
    	int n = 1;
    	float S = 0;
    	for (int i = 1; i <= n; i++) {
            S += (float)Math.pow(-1, (i + 1)) * (i /(float) ((i + 1) + giaiThua(i)));			
		}
    	System.out.println("S = "+ S);
	}
    private static int giaiThua(int n) {
    	int gT = 1;
    	for (int i = 1; i <= n; i++) {
			gT *= i;
		}
    	return gT;
    }
} 
