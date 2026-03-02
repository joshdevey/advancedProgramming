package com.jd.advproj;

public class Student {

	String name;
	ModuleMark[] mark;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void ModuleMark(ModuleMark[] marks) {
		this.mark = marks;
	}
	
	public double calculateOverallGrade() {
		
		double total = 0;
		
		for(var i = 0; i < mark.length; i++) {
			total += mark[i].calculateUnitGrade();
		}
		
		return total / mark.length;
	}
	
	public String toString() {
		return "Name: " + name;
	}
	
}
