package Sample;

public class AddressNew {
	String state;
	String city;
	Coordinates coordinates;
	public AddressNew(String state, String city, Coordinates coordinates) {
		super();
		this.state = state;
		this.city = city;
		this.coordinates = coordinates;
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
	public Coordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "AddressNew [state=" + state + ", city=" + city + ", coordinates=" + coordinates + "]";
	}
	
	

}
