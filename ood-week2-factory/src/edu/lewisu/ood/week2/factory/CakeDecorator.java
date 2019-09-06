package edu.lewisu.ood.week2.factory;

public abstract class CakeDecorator extends Cake {
	Cake cake;
	public abstract String getDescription();
}
