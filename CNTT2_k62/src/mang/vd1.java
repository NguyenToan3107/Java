package mang;

import java.util.Arrays;

public class vd1 {
     public static void main(String[] args) {
		 // int n = 5;
    	 // khoi tao gia tri cho mang 
    	 int a[] = new int[] {-5, 3, -10, 20, 15, 9, 25, 6};
		 System.out.println(Arrays.toString(a));
		 
		 // y 1
		 System.out.println("So phan tu chia het cho 3");
		 demSoKoChiaHetCho3(a);
		 System.out.println("----------------------");		 
		 // y 2
		 tongVaTBC();
		 System.out.println("----------------------");
		 
		 // y 3
		 System.out.println("Phan tu chia het cho 3 max: ");
		 ptuLonNhatChiaHetCho3(a);
		 System.out.println("----------------------");
		 		 
		 // y 4
		 System.out.println("Mang ban dau: ");
		 System.out.println(Arrays.toString(a));
		 System.out.println("Mang sau khi sort: ");
		 quickSort(a, 0, a.length - 1);
		 System.out.println(Arrays.toString(a));
		 
		
		 // y 5
    	 
    	 int b[] = new int[a.length];
		 for (int i = 0; i < a.length; i++) {
			if(!checkNumber(a, i)) {
				b[i] = a[i];
			}		
		 }
		 System.out.println("Mang sau khi loai ptu: ");
		 a = b.clone();
		 System.out.println(Arrays.toString(a));
	 }
     
     // kiem tra dieu kien chia het cho 5 no ko chia het cho 3
     private static boolean checkNumber(int a[], int i) {
			if(a[i] % 5 == 0 && a[i] % 3 != 0) {
				return true;
			}
    	 return false;
     }
     
     // tim ra vi tri pivot 
     private static int partition(int a[], int low, int high) {
    	 int pivot = a[high];
    	 int left = low - 1;
    	 
    	 for (int i = low; i < high; i++) {
			if(Math.abs(a[i]) < Math.abs(pivot)) {
				left++;
				
				int temp = a[left];
				a[left] = a[i];
				a[i] = temp;
			}
		}
    	 int temp = a[left + 1];
    	 a[left + 1] = a[high];
    	 a[high] = temp;
    	 
    	 return left + 1;
     }
     
     private static void quickSort(int a[], int low, int high) {
 		if(low < high) {
 			int index = partition(a, low, high);
 			
 			// goi de quy 2 mang con trai va phai
 			quickSort(a, low, index - 1);
 			quickSort(a, index + 1, high);
 		}
 	}
     
	 private static void ptuLonNhatChiaHetCho3(int[] a) {
	 	int max = a[0];
         for (int i =0; i < a.length; i++) {
			if(a[i] > max && a[i] % 3 == 0) {
				max = a[i];
			}
		 }
         System.out.println(max);
	 }


	 private static void tongVaTBC() {
		int S = 0;
		 for(int i = -5; i <= 25; i++) {
			 S += i;
		 }
		 float TBC = S / (25 - (-5));
		 System.out.println("Tong: "+S);
		 System.out.println("TBC = "+TBC);
	 }

     
	 private static void demSoKoChiaHetCho3(int[] a) {
		int index = 0;
		 for (int i = 0; i < a.length; i++) {
             if(a[i] > 0 && a[i] % 3 != 0) {
            	 index++;
             }
		}
		 System.out.println(index);
	 }

}
