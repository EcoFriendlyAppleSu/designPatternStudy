package headFirst.duckPractice;

import headFirst.duckPractice.fly.FlyBehavior;
import headFirst.duckPractice.fly.FlyWithWings;
import headFirst.duckPractice.quack.Quack;
import headFirst.duckPractice.quack.QuackBehavior;

public class factoryDuck {
    public static void createDuck() {
        QuackBehavior quack = new Quack();
        FlyBehavior flyWithWings = new FlyWithWings();
        quack.quack();
        flyWithWings.fly();
    }
}
