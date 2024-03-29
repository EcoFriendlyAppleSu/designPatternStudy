package adaptorPattern.SimpleDuckProject;


/**
 * 어댑터 패턴은 호환되지 않는 것을 호환 가능하게 만들어주는 것
 */
public class ExeSimpleDuckProject {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        testDuck(duck);

        System.out.println("\n칠면조 Adaptor가 말하길");
        testDuck(turkeyAdapter);

        System.out.println("===========================");
        Turkey turkey1 = new WildTurkey();
        Duck duck1 = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck1);

        System.out.println("\n오리 Adaptor가 말하길");
        testTurkey(duckAdapter);

    }

    public static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }

    public static void testTurkey(Turkey turkey) {
        turkey.fly();
        turkey.gobble();
    }
}
