package Sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapOperation {

	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(101, "Deva");
		students.put(102, "Arun");
		students.put(103, "Venkat");
		
		System.out.println(students.get(102));
		
		System.out.println(students.containsKey(103));
		
		System.out.println(students.containsValue("Deva"));
		
		System.out.println(students.getOrDefault(104, "Not Found"));
		
		students.put(103, "Venkatesh");
//		System.out.println(students.get(103));
		
		students.putIfAbsent(103, "venkat");
		System.out.println(students.get(103));
		
//		System.out.println(students.keySet());
		
//		for (Integer i: students.keySet()) {
//			System.out.println(i);
//		}
//		
//		for (String i: students.values()) {
//			System.out.println(i);
//		}
		
		for(Entry<Integer, String> i: students.entrySet()) {
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
		
		
	}

}
