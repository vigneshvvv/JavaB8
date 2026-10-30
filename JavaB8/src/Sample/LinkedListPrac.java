package Sample;

import java.util.LinkedList;

public class LinkedListPrac {

	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<>();
		
		lst.add(10);
		lst.addFirst(20);
		lst.addLast(30);
		System.out.println(lst.getFirst());
		
		System.out.println(lst.get(1));
		
		lst.set(1, 25);
		System.out.println(lst);
		

	}

}
