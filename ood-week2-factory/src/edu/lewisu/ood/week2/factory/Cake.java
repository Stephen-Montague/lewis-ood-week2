package edu.lewisu.ood.week2.factory;

public abstract class Cake {
	String description = "Custom Cake";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
