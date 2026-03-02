package com.mmu.josh;

public class Customer {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void raiseOrder(Order order) throws OrderTooSmallException {
		if(order.getCost() < 50.00) {
			throw new OrderTooSmallException();
		}
	}
	
}
