package strategyPattern.character;

public class Queen extends Character{

    public Queen() {
        fight();
    }

    @Override
    public void fight() {
        System.out.println("I'm Queen.");
    }
}
