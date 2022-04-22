package adaptorPattern.SimpleDuckProject;

/**
 * Adaptor class
 * 1. target interface를 subtyping해서 adaptor를 만들 수 있다.
 * 2. adaptor class 안에는 adaptee instance가 필요하다.
 *
 */
public class TurkeyAdapter implements Duck {

    /**
     * adaptee instance Turkey
     */
    public Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
