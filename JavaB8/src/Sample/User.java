package Sample;

import java.util.List;

public class User {
	
	int id;
	String firstName;
	String lastName;
	int age;
	AddressNew address;
	List<Review> reviews;
	public User(int id, String firstName, String lastName, int age, AddressNew address, List<Review> reviews) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.reviews = reviews;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AddressNew getAddress() {
		return address;
	}
	public void setAddress(AddressNew address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address="
				+ address + ", reviews=" + reviews + "]";
	}

	

}
