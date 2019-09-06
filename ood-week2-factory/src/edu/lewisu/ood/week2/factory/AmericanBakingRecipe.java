package edu.lewisu.ood.week2.factory;

public class AmericanBakingRecipe extends BakingRecipe {
	Cake bakeCake(String flavor) {
		if (flavor.equals("Angel Food")) {
    		return new USA_AngelFoodCake();
	    } else if (flavor.equals("Devil's Food")) {
		    return new USA_DevilsFoodCake();
		} else return null;
	}

}
