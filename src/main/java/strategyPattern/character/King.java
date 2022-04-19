package strategyPattern.character;

public class King extends Character{

    public King() {
        fight();
    }

    @Override
    public void fight() {
        System.out.println("I'm King.");
    }
}
