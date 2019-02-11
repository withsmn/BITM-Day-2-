package oopbasics;

//Data class
// POJO - > Plain Old Java Object
public class Student{
	private String name;
	private int age;
	private int seid;
	private String courseName;
	
	
	public Student(String name, int age, int seid, String courseName) {
		this.name = name;
		this.age = age;
		this.seid = seid;
		this.courseName = courseName;
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		//default constructor
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSeid() {
		return seid;
	}
	public void setSeid(int seid) {
		this.seid = seid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", seid=" + seid + ", courseName=" + courseName + "]";
	}
	
}
