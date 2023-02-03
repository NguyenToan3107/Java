package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dqueue {
   public static void main(String[] args) {
	   Deque<String> ds = new ArrayDeque<String>();
 	   ds.offer("Toan");
 	   ds.offer("Nung");
 	   ds.offer("An");
 	   ds.offer("TITV");
 	   ds.offer("Hoc Lap Trinh");
 	   ds.offerFirst("Lap Trinh React");
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
