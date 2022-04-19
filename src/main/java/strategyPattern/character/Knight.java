package strategyPattern.character;

public class Knight extends Character{

    public Knight() {
        fight();
    }

    @Override
    public void fight() {
        System.out.println("I'm Knight.");
    }
}
