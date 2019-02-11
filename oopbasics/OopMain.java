package oopbasics;

import java.util.ArrayList;
import java.util.Scanner;

public class OopMain {

	public static void main(String[] args) {
		Scanner scString = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		
		System.out.println("Welcome to Registration form");
		System.out.println("=================================");
		
		System.out.println("How many students: ");
		int count = scInt.nextInt();
		ArrayList<Student> students = new ArrayList<Student>();
		for(int i = 0; i < count; i++) {
			System.out.println("Enter Name: ");
			String name = scString.nextLine();
			System.out.println("Enter Course: ");
			String course = scString.nextLine();
			System.out.println("Enter age: ");
			int age = scInt.nextInt();
			System.out.println("Enter SEID: ");
			int seid = scInt.nextInt();
			students.add(new Student(name, age, seid, course));
		}
		for(Student s : students) { 
			System.out.println(s); 
		}
		
		/*
		 * Student s1 = new Student("Hasib",20,235566,"MAD"); Student s2 = new
		 * Student("Masud",21,239988,"MAD"); Student s3 = new
		 * Student("Shajib",22,232588,"MAD");
		 * 
		 * ArrayList<Student> students = new ArrayList<>(); students.add(s1);
		 * students.add(s2); students.add(s3);
		 * 
		 * for(Student s : students) { System.out.println(s); }
		 * 
		 * for(int i = 0; i < students.size(); i++) {
		 * System.out.println(students.get(i)); }
		 */
		
	}

}
