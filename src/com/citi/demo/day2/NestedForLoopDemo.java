package com.citi.demo.day2;

public class NestedForLoopDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + " "); // use j instead of i
			}
			System.out.println("");

		}

	}
}
