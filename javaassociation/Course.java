package javaassociation;

public class Course {
	private String courseName;
	private double credit;
	public Course(String courseName, double credit) {
		super();
		this.courseName = courseName;
		this.credit = credit;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", credit=" + credit + "]";
	}
	
	
}
