package com.mmu.jd;

public class Cat extends Pet implements Strokeable {

	public void stroke() {
		System.out.println(super.getName() + " wanders off and ignores you.");
	}
}
