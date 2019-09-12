package characters;

import behaviours.IAttack;
import behaviours.IDefend;
import powers.ArmourType;
import powers.WeaponType;

public class Knight extends Player implements IAttack {

    private WeaponType weapon;
    private ArmourType armour;

    public Knight(String name, WeaponType weapon, ArmourType armour) {
        super(name);
        this.weapon = weapon;
        this.armour = armour;
    }

    public WeaponType getWeapon() {
        return this.weapon;
    }

    public int getWeaponDamage() {
        return this.weapon.getDamage();
    }

    public int getArmourResistance() {
        return this.armour.getResistance();
    }

    public void attack(IDefend character) {
        defend(character.getDamage());
        character.defend(getDamage());
    }

    public void defend(double damage) {
        this.health -= damage/getArmourResistance();
    }

    public double getDamage() {
        return getWeaponDamage();
    }
}
