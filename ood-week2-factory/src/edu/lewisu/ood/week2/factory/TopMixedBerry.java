package edu.lewisu.ood.week2.factory;

public class TopMixedBerry extends CakeDecorator {

	public TopMixedBerry(Cake cake) {
		this.cake = cake;
	}
 
	public String getDescription() {
		return cake.getDescription() + ", Mixed Berries";
	}
 
	public double cost() {
		return cake.cost() + 2.00;
	}
}
