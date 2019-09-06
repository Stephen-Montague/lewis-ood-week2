package edu.lewisu.ood.week2.factory;

public class JapaneseBakingRecipe extends BakingRecipe {
	Cake bakeCake(String flavor) {
		if (flavor.equals("Angel Food")) {
			return new JAP_AngelFoodCake();
	    } else if (flavor.equals("Devil's Food")) {
	    	return new JAP_DevilsFoodCake();
		} else return null;
	}
	
}
