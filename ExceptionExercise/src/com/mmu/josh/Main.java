package com.mmu.josh;

public class Main {
	
	public static void main(String args[]) {
		
		Customer works = new Customer();
		works.setName("This works");
		Order under = new Order();
		under.setTime("AM");
		under.setCost(29.99);
		try {
			works.raiseOrder(under);
			System.out.println("Order is good!");
		} catch (OrderTooSmallException orderTooSmallException) {
			System.out.println("Order too low");
		}
		
	}

}
