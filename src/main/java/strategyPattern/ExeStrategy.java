package strategyPattern;

import strategyPattern.character.Character;
import strategyPattern.character.King;
import strategyPattern.weapon.KnifeBehavior;
import strategyPattern.weapon.WeaponBehavior;

public class ExeStrategy {
    public static void main(String[] args) {
        Character king = new King();
        WeaponBehavior knifeBehavior = new KnifeBehavior();
        king.setWeaponBehavior(knifeBehavior);
        knifeBehavior.useWeapon();
    }
}
