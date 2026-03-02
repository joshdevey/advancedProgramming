package com.mmu.jd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PetShop {
	
	private ArrayList<Pet> petsForSale;
	
	public ArrayList<Pet> getPetsForSale() {
		return petsForSale;
	}

	public void setPetsForSale(ArrayList<Pet> petsForSale) {
		this.petsForSale = petsForSale;
	}

	Dog buyDog() {
		
		Dog dog = null;
		
		for(int i = 0; i < this.petsForSale.size(); i++) { 
			if(petsForSale.get(i) instanceof Dog) {
				dog = (Dog) petsForSale.get(i);
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
		petsForSale.sort(new Comparator<Pet>() {

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
