package strategyPattern.character;

public class Troll extends Character{

    public Troll() {
        fight();
    }

    @Override
    public void fight() {
        System.out.println("I'm Troll.");
    }
}
