package com.mmu.jd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter temperature");
		
		Scanner scanner = new Scanner(System.in);
		
		Temperatures collection = new Temperatures();
		
		boolean getNext = true; 
		
		while(getNext) {
		
			getNext = false;
		
			try {
				int userTemp = scanner.nextInt();
			
				collection.addTemperature((double) userTemp);
				
				getNext = true;
				
				
			} catch(InputMismatchException exception) {
				
				System.out.println("Finished");
				System.out.println("Max temperature: " + collection.getMax());
				System.out.println("Min temperature: " + collection.getMin());
				System.out.println("Average temperature: " + collection.getAverageTemp());
				
			}
			
		}
		
		
	}

}
