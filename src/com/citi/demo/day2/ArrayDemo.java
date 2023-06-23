package com.citi.demo.day2;

public class ArrayDemo {

	public static void main(String[] args) {

//		int maths = 99;
//		int phy = 95;
//		int chem = 97;
//		int eng = 69;
//		int sans = 77;

//		int marks = 99, 87, 99, 95, 98;

		// create an int array 
		int[] marks = { 99, 87, 92, 95, 98 };
		
		System.out.println("Chemistry");
		System.out.println(marks[2]); // 3rd element - 92
		System.out.println("Maths");
		System.out.println(marks[0]); // 1st element - 99
		System.out.println("All subjects");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(marks[i]);
		}
		
		
//		System.out.println(marks); // not going to work 
		

		
//		String[] myFriends = { "Sonu", "Monu", "Tonu" };

	}

}

// a comment 