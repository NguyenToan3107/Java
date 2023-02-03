package main;

import java.util.Scanner;
import java.util.Stack;

public class test {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackString = new Stack<String>();
		
//		stackString.push("giatri") => dua gtri vao stack
//		stackString.pop();         => lay gtri ra , ko xoa khoi stack
//		stackString.peek() => lay gtri ra , xoa khoi stack
//		stackString.clear();       => xoa all element khoi stack
//		stackString.contains("giatri") => xd gtri co ton tai trong stack hay ko
//		stackString.size()         => do lon cua stack
		
//		vidu dao nguoc chuoi
		System.out.println("Nhap vao chuoi: ");
		String s = sc.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			stackString.push(s.charAt(i)+ ""); // charAt lay ra char nen phai them "" de thanh chuoi
		}
		System.out.println("Reverse string: ");
		for(int i = 0; i < s.length(); i++) {
			System.out.print(stackString.pop());
		}
		System.out.println("");
		//  vi du chuyen tu he thap phan sang nhi phan
		Stack<Integer> stackSoDu = new Stack<Integer>(); 
		System.out.println("Nhap 1 so nguyen duong tu ban phim");
		int x = sc.nextInt();
		
		while(x>0) {
			int soDu = x % 2;
			stackSoDu.push(soDu);
			x = x / 2;
		}
		System.out.println("So nhi phan la: ");
		int n = stackSoDu.size();
		for(int i = 0; i < n; i++) {
			System.out.print(stackSoDu.pop());
		}
	}
}
