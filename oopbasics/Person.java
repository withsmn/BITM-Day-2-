package oopbasics;

public class Person {
	private String nid;
	private String city;
	public Person(String nid, String city) {
		super();
		this.nid = nid;
		this.city = city;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [nid=" + nid + ", city=" + city + "]";
	}
	
	
}
