package headFirst.duckPractice.duckExtend;

import headFirst.duckPractice.fly.FlyBehavior;
import headFirst.duckPractice.quack.QuackBehavior;

public abstract class DuckExtendVersion {
    public QuackBehavior quackBehavior;
    public FlyBehavior flyBehavior;

    public DuckExtendVersion() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 변수가 interface라는 것은 확장하고 있는 자식 클래스를 대입할 수 있다는 것을 의미한다.
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
