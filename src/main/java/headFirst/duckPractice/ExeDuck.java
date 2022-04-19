package headFirst.duckPractice;

import headFirst.duckPractice.duckExtend.DuckExtendVersion;
import headFirst.duckPractice.duckExtend.MallardDuck;
import headFirst.duckPractice.fly.FlyNoWay;
import headFirst.duckPractice.quack.MuteQuack;

public class ExeDuck {

    public static void main(String[] args) {
        // Duck.getInstance(); // 캡슐화
        // factoryDuck.createDuck();

        DuckExtendVersion mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new MuteQuack());
        mallardDuck.performFly();
        mallardDuck.performQuack();

    }
}
