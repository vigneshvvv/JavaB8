package Sample;

public class Address {
	
	String address;
	String state;
	String city;
	public Address(String address, String state, String city) {
		super();
		this.address = address;
		this.state = state;
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", state=" + state + ", city=" + city + "]";
	}
	
	

}
