package javabasics;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		int x = 10;
		float f = 1.5f;
		double d = 5.9;
		boolean b = false;
		
		int[]randoms = new int[10];
		randoms[0] = 11;
		randoms[1] = 32;
		
		int[] numbers = {5,9,7,1,6,3,8,9,5,1};
		
		String s = "bitm";
		s.length();
		
		if(x == 10) {
			System.out.println("10");
		}else {
			System.out.println("some number");
		}
		
		switch(x) {
		case 10:
			System.out.println("10");
			break;
			default:
				System.out.println("some number");
				break;
		}
		
		/*
		 * for(int i = 0; i < numbers.length; i++) { System.out.println(numbers[i]); }
		 */
		
		for(int z : numbers) {
			System.out.println(z);
		}
		
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Dhaka");
		cities.add("Chittagong");
		cities.add("Rajshahi");
		cities.add("Khulna");
		cities.add(1, "Sylhet");
		
		for(String c : cities) {
			System.out.println(c);
		}
		
		//System.out.println(cities.get(5));
		
		for(String ct : cities) {
			if(ct.equals("Dhaka")) {
				System.out.println(cities.indexOf(ct));
			}
		}
		
	}
	
	

}
