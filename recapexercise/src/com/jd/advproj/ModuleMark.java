package com.jd.advproj;

public class ModuleMark {
	
	double courseWorkOne;
	double courseWorkTwo;
	
	public ModuleMark(int courseWorkOne, int courseWorkTwo) {
		this.courseWorkOne = courseWorkOne;
		this.courseWorkTwo = courseWorkTwo;
	}
	
	public double calculateUnitGrade() {
		return courseWorkTwo + courseWorkOne;
		
	}
	
	public String calculateUnitClassification() {

		double overall = calculateUnitGrade();
		if(overall >= 70) {
			return "I";
		} else if(overall < 70 && overall >= 60) {
			return "II";
		} else if(overall < 60 && overall >= 50) {
			return "III";
		} else {
			return "Fail";
		}
		
	}
	
}
