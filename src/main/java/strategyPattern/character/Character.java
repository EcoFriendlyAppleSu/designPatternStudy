package strategyPattern.character;

import strategyPattern.weapon.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
