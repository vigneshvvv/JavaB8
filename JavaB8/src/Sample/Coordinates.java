package Sample;

public class Coordinates {
	String lat;
	String lng;
	public Coordinates(String lat, String lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "Coordinates [lat=" + lat + ", lng=" + lng + "]";
	}
	
	

}
