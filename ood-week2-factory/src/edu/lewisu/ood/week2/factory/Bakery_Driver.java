package edu.lewisu.ood.week2.factory;

/*
 * Stephen Montague
 * Object Oriented Development
 * Fall 2019 - Term 1
 * Week 2 - Baking Factory
 *
 * Summary:
 *     Demonstrates a Factory Pattern using a baking theme.
 *     Slightly mods Coffee & Pizza-themed code from course textbook -
 *     Head First Design Patterns, by Freeman, et al., available from -
 *     https://www.wickedlysmart.com/head-first-design-patterns/
 *
 * Program Notes:
 *     Creates Cake objects via a factory pattern.
 *     Prints a description of Cake objects, as decorated.
 *     Current output:
 *         Angel Food Cake (American: full-sugar), White Frosting, Candles $8.50
 *         Devil's Food Cake (Japanese: half-sugar), Chocolate Frosting, Mixed Berries $10.00
 */

public class Bakery_Driver {
    // Driver class to create, decorate, and print cakes at runtime.

    public static void main(String args[]) {
    	// Demo Factory
    	BakingRecipe usaRecipe = new AmericanBakingRecipe();
    	BakingRecipe japRecipe = new JapaneseBakingRecipe();
   	    Cake cake1 = usaRecipe.orderCake("Angel Food");
        Cake cake2 = japRecipe.orderCake("Devil's Food");

        // Demo Decorator      
        cake1 = new TopFrostedWhite(cake1);
        cake1 = new TopCandles(cake1);
        cake2 = new TopFrostedChoco(cake2);
        cake2 = new TopMixedBerry(cake2);
    
        // Print Output
        System.out.println(cake1.getDescription()
                + " $" + String.format("%.2f", (double)cake1.cost()));
        System.out.println(cake2.getDescription()
                + " $" + String.format("%.2f", (double)cake2.cost()));
        }
}

