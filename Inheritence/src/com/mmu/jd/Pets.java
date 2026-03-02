package com.mmu.jd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pets {

	@Test
	void testDog() {
		Dog dog = new Dog();
		dog.setName("dog");
		assertEquals("dog", dog.getName());
		dog.stroke();
	}

	@Test
	void testCat() {
		Cat cat = new Cat();
		cat.setName("cat");
		assertEquals("cat", cat.getName());
		cat.stroke();
	}
	
}
