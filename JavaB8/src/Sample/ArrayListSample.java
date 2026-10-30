package Sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		
		System.out.println(lst);
		System.out.println(lst.get(0));
		
		lst.set(1, 15);
		System.out.println(lst);
		
		lst.remove(1);
		System.out.println(lst);
		
		System.out.println(lst.contains(30));
		
		System.out.println(lst.indexOf(30));
		
		System.out.println(lst.size());
		
		lst.clear();
		
		lst.isEmpty();
		

	}

}
