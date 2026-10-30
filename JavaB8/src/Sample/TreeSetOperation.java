package Sample;

import java.util.TreeSet;

public class TreeSetOperation {

	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<>();
		tr.add(20);
		tr.add(10);
		tr.add(10);
		tr.add(30);
		tr.add(5);
		
		System.out.println(tr);
		
		
		tr.remove(20);
		System.out.println(tr);
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		System.out.println(tr.higher(30));
		
		
		tr.pollFirst();
		tr.pollLast();
		
		tr.clear();

	}

}
