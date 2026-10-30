package Sample;

import java.util.ArrayList;
import java.util.List;

public class ObjectPractice {

	public static void main(String[] args) {
//		Employee emp = new Employee(1,"Deva", "Deva@gmail.com", "chennai");
//		emp.setId(1);
//		emp.setEmployeeName("Deva");
//		emp.setEmail("deva@gmail.com");
//		emp.setCity("Chennai");
		
//		System.out.println(emp.getCity());
		
		Employee em = new Employee();
		em.setId(1);
		em.setEmployeeName("Deva");
		em.setEmail("deva@gmail.com");
		em.setCity("Chennai");
		
		System.out.println(em);
		
		Address address = new Address("Ezhil Nagar", "TN", "Chennai");
		List<String> tech = new ArrayList<String>();
		tech.add("Java");
		tech.add("Python");
		tech.add("React");

		Employee emp = new Employee(1,"Deva", "Deva@gmail.com", "chennai", address, tech);
		System.out.println(emp);
		
		Review review = new Review("3", null);
		Review review1 = new Review("3", null);
		Review review2 = new Review("3", null);
		
		List<Review> reviews = new ArrayList<>();
		reviews.add(review);
		reviews.add(review1);
		reviews.add(review2);
		
		Coordinates coordinates = new Coordinates("2331213", "1.2321");
		AddressNew addressNew = new AddressNew("TN", "Chennai", coordinates);
		User user = new User(1, "Vignesh", "Kumar", 25, addressNew, reviews);
		
		System.out.println(user);
		
	

	}

}
