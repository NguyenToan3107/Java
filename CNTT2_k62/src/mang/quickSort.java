package mang;

import java.util.Arrays;

public class quickSort {
	
	private static int partition(int a[], int low, int high) {
		int pivot = a[high];
		int left = low - 1;
		
		for(int i = low; i < high; i++) {
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
	
    public static void main(String[] args) {
		int a[] = {7, 6, 2, -33, 4, -5, 9, 8};
		System.out.println(Arrays.toString(a));
		
		quickSort(a, 0, a.length - 1);
		
		System.out.println(Arrays.toString(a));
		
		
	}
}
