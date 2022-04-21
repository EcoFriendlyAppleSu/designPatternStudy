package decoratePattern.practiceDecoratePattern;

import decoratePattern.practiceDecoratePattern.cream.Cream;
import decoratePattern.practiceDecoratePattern.cream.Whip;

public class Beverage {

    private float beverageCost = 4.0f;
    private Cream cream;

    public Beverage() {
        cream = new Whip(beverageCost);
        System.out.println(cream.cost());
    }

    public float getBeverageCost() {
        return beverageCost;
    }

    public void setBeverageCost(float beverageCost) {
        cream = new Whip();
        cream.cost();
        this.beverageCost += beverageCost;
    }
}
