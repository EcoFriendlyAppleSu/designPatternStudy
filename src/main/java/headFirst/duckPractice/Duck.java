package headFirst.duckPractice;

import headFirst.duckPractice.fly.FlyBehavior;
import headFirst.duckPractice.quack.QuackBehavior;

public class Duck {
    private String duckName;
    private long wingNum;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    private Duck() {
        this.duckName = "wings";
        this.wingNum = 2;
    }

    public static Duck getInstance() {
        return duckHolder.INSTANCE;
    }

    /**
     * inner class
     */
    private static class duckHolder {
        private static final Duck INSTANCE = new Duck();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
