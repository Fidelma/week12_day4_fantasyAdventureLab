package characters;

import powers.ArmourType;
import powers.WeaponType;

public class Knight extends Player {

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
}
