package Sample;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {

	public static void main(String[] args) {
		Set<Integer> sample = new HashSet<Integer>();
		sample.add(10);
		sample.add(10);
		sample.add(20);
		System.out.println(sample);
		
		sample.remove(20);
		System.out.println(sample);
		
		System.out.println(sample.size());
		
		sample.clear();
		
		System.out.println(sample.isEmpty());
	}

}
