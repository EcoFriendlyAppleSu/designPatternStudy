package strategyPattern.weapon;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Using Knife");
    }
}
