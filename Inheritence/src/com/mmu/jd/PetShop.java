package com.mmu.jd;

import java.util.Arrays;
import java.util.Comparator;

public class PetShop {
	
	private Pet[] petsForSale;
	
	public Pet[] getPetsForSale() {
		return petsForSale;
	}

	public void setPetsForSale(Pet[] petsForSale) {
		this.petsForSale = petsForSale;
	}

	Dog buyDog() {
		
		Dog dog = null;
		
		for(int i = 0; i < this.petsForSale.length; i++) { 
			if(petsForSale[i] instanceof Dog) {
				dog = (Dog) petsForSale[i];
			}
		}
		
		if(dog == null) {
			throw new Error("No Dog");
		}
		
		return dog;
	}
	
	Cat buyCat() {
		
		Cat cat = null;
		
		for(Pet pet: petsForSale) {
			if(pet instanceof Cat) {
				cat = (Cat) pet;
			}
		}
		
		if(cat == null) {
			throw new Error("No Cat");
		}
		
		return cat;
	}
	
	Goldfish buyGoldfish() {
		
		Goldfish fish = null;
		
		for(Pet pet: petsForSale) {
			if(pet instanceof Goldfish) {
				fish = (Goldfish) pet;
			}
		}
		
		if(fish == null) {
			throw new Error("No Fish");
		}
		
		return fish;
	}
	
	void listPets() {
		System.out.println("Pets: ");
		for(Pet pet: petsForSale) {
			System.out.println(pet.getName() + ": " + pet.getAge());
		}
	}
	
	
	void sortPetsByAge() {
		Arrays.sort(petsForSale, new Comparator<Pet>() {

			@Override
			public int compare(Pet pet1, Pet pet2) {
				// TODO Auto-generated method stub
				if(pet1.getAge() > pet2.getAge()) {return -1; }
				if(pet1.getAge() == pet2.getAge()) {return 0; }
				return 1;
			}
			
		});
	
	}
	
}
