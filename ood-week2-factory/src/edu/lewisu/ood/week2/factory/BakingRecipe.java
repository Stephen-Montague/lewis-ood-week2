package edu.lewisu.ood.week2.factory;

public abstract class BakingRecipe {
	abstract Cake bakeCake(String flavor);
	
	public Cake orderCake(String flavor) {
		Cake cake = bakeCake(flavor);
		return cake;
	}
}
