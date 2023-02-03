package main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
       Queue<String> ds = new PriorityQueue<String>();
 	   ds.offer("Toan");
 	   ds.offer("Nung");
 	   ds.offer("An");
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
