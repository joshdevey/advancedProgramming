package com.mmu.jd;

import java.util.ArrayList;
import java.util.List;

public class Temperatures {
	
	public List<Double> temperatures;
	
	public void addTemperature(Double temperature) {
		
		if(this.temperatures == null) {
			this.temperatures = new ArrayList<Double>();
		}
		
		this.temperatures.add(temperature);
		
	}

	public Double getMax() {
		temperatures.sort(null);
	
		return temperatures.get(temperatures.size() - 1);
	}


	public Double getMin() {
		temperatures.sort(null);
	
		return temperatures.get(0);
	}
	
	public Double getAverageTemp() {
		
		double total = 0;
		
		for(Double temp: temperatures) {
			total += temp;
		}
		
		return total / this.temperatures.size();
	}
}
