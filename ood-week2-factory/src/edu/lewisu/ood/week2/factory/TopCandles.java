package edu.lewisu.ood.week2.factory;

public class TopCandles extends CakeDecorator {

    public TopCandles(Cake cake) {
        this.cake = cake;
    }

    public String getDescription() {
        return cake.getDescription() + ", Candles";
    }

    public double cost() {
        return cake.cost() + 0.50;
    }
}