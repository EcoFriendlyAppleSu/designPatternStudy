package strategyPattern.weapon;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Using BowAndArrow");
    }
}
