package com.mmu.jd;

public class Dog extends Pet implements Strokeable {

	public void stroke() {
		System.out.println(super.getName() + " enjoys being stroked");
		System.out.println("Woof!");
	}
	
}
