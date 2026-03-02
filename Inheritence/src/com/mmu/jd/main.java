package com.mmu.jd;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Dog hugo = new Dog();
		hugo.setName("Hugo");
		hugo.setAge(2);

		Cat max = new Cat();
		max.setName("Max");
		max.setAge(5);
	
		Goldfish fish = new Goldfish();
		fish.setName("Fish");
		fish.setAge(1);
		
		PetShop theHouseOfPets = new PetShop();
		
		ArrayList<Pet> petsForSale = new ArrayList<>();
		petsForSale.add(hugo);
		petsForSale.add(max);
		petsForSale.add(fish);
		
		
		theHouseOfPets.setPetsForSale(petsForSale);
		theHouseOfPets.listPets();
		theHouseOfPets.sortPetsByAge();
		theHouseOfPets.listPets();
	
		Dog buy = theHouseOfPets.buyDog();
		Cat buyC = theHouseOfPets.buyCat();
		Goldfish buyG = theHouseOfPets.buyGoldfish();

		
		System.out.println(buy.getName() + " has been bought");
		System.out.println(buyC.getName() + " has been bought");
		System.out.println(buyG.getName() + " has been bought");
	}

}
