package adaptorPattern.SimpleDuckProject;

public class DuckAdapter implements Turkey {

    public Duck duck;

    /**
     * duck(adaptee)을 가져와 Turkey(target interface)에 끼워 맞추겠다.
     * @param duck
     */
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
