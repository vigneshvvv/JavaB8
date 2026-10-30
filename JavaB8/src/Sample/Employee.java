package Sample;

import java.util.List;

public class Employee {
	int id;
	String employeeName;
	String email;
	String city;
	Address address;
	List<String> techSkills;
	
	public Employee() {
		super();
	}

	public Employee(int id, String employeeName, String email, String city, Address address, List<String> techSkills) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.email = email;
		this.city = city;
		this.address = address;
		this.techSkills = techSkills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getTechSkills() {
		return techSkills;
	}

	public void setTechSkills(List<String> techSkills) {
		this.techSkills = techSkills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", email=" + email + ", city=" + city
				+ ", address=" + address + ", techSkills=" + techSkills + "]";
	}

	
	
	
	

}
