package Sample;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueuePract {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(40);
		pq.add(10);
		pq.add(30);
		pq.add(15);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		pq.poll();
		pq.poll();
		System.out.println(pq);
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
		
		pq1.add(20);
		pq1.add(10);
		pq1.add(30);
		pq1.add(15);
		
		System.out.println(pq1);
		pq1.poll();
		System.out.println(pq1);
		
		
		
		
		
		
	}

}
