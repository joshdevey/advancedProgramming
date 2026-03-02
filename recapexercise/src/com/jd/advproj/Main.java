package com.jd.advproj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student josh = new Student("Josh");
		ModuleMark one = new ModuleMark(12, 12);
		ModuleMark two = new ModuleMark(30, 35);
		ModuleMark three = new ModuleMark(50, 50);
		
		ModuleMark[] marks = {one, two, three};
		
		josh.ModuleMark(marks);
		
		System.out.println(josh.toString());
		System.out.println("Average marks: " + josh.calculateOverallGrade());
		
	}
	
	public static void railCard() {
		Scanner scanner = new Scanner(System.in);
		
		String name = "Josh";
		int age = scanner.nextInt();
		
		if(age >= 16 && age <= 25) {
			System.out.println("You can use 16-25 Railcard");
		} else if(age > 25 && age <= 30) {
			System.out.println("You can use 26-30 Railcard");
		} else if(age >= 60) {
			System.out.println("You can use Senior Railcard");
		} else {
			System.out.println("You are not eligable");
		}
	}
	
}