package templatePattern.bevarge;

public abstract class CaffeineBeverage {

    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        // addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Now the water is boiling");
    }

    void pourInCup() {
        System.out.println("Pour the thing into the cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
