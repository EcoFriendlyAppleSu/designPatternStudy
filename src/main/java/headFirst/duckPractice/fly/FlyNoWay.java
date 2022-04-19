package headFirst.duckPractice.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I have two Wings but can't fly");
    }
}
