package main;

import java.util.LinkedList;
import java.util.Queue;

public class queueVidu {
   public static void main(String[] args) {
	   
	   Queue<String> ds = new LinkedList<String>();
	   
	   ds.offer("Toan");
	   ds.offer("Tung");
	   ds.offer("TITV");
	   ds.offer("Hoc Lap Trinh");
	   
	   while(true) {
		   String ten =  ds.poll(); // lay ra va xoa
		   // peek => lay ra nhung ko xoa
		   if(ten == null) {
			   break;
		   }
		   System.out.println(ten);
	   }
   }
}
