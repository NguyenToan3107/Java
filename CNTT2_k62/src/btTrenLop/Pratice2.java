package btTrenLop;

public class Pratice2 {
    public static void main(String[] args) {
		double a[] ={3, -5, 1, 3, -4};
		double max = 0;
        boolean status = false;
        
		
		for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i]) < (i + 1)) {
            	max = a[i];
				status = true;
				break;
			}			
		}
		if(!status) {
			System.out.println("Error.");
			return;
		}else {
			for (int i = 0; i < a.length; i++) {
	            if (Math.abs(a[i]) < (i + 1) && max < a[i]) {
	            	max = a[i];
				}			
			}
		}

		System.out.println(max);			
	}
}
