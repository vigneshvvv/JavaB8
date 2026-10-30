package Sample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackPrac {
	
	public static void main(String[] args) {
		Stack<Integer> sc = new Stack<>();
		
		sc.push(10);
		sc.push(20);
		sc.push(30);
		
		System.out.println(sc);
		System.out.println(sc.peek());
		
		sc.pop();
		System.out.println(sc);
		
		System.out.println(sc.search(20));
		
		Queue<Integer> qe = new LinkedList<Integer>();
		qe.add(10);
		qe.add(40);
		qe.offer(20);
		
		System.out.println(qe);
		
		System.out.println(qe.peek());
		
		qe.poll();
		
		System.out.println(qe);
		
		
		
		
		
		
	}
	

}
