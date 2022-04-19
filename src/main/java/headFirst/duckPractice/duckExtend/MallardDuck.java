package headFirst.duckPractice.duckExtend;

import headFirst.duckPractice.fly.FlyWithWings;
import headFirst.duckPractice.quack.Squack;

public class MallardDuck extends DuckExtendVersion {

    public MallardDuck() {
        quackBehavior = new Squack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
