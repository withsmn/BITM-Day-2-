package javaassociation;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student("Raihan", 22);
		s1.setAddress(new PostalAddress("200", "8", "Dhaka", "1215"));
		s1.getAddress().setContact(new ContactInfo("test@gmail.com", "555555"));
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(new Course("Computer Fundamental", 3.0));
		courses.add(new Course("Computer Graphics", 3.0));
		courses.add(new Course("Linear Algebra", 1.5));
		s1.setCourses(courses);
		System.out.println(s1);
		
		
		for(Course c : s1.getCourses()) {
			System.out.println(c.getCourseName());
		}
		
		System.out.println(s1.getCourses().get(1).getCredit());
	}

}
