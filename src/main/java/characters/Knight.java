package characters;

import powers.ArmourType;
import powers.WeaponType;

public class Knight extends Player {

    private WeaponType weapon;
    private ArmourType armour;

    public Knight(String name, double health, WeaponType weapon, ArmourType armour) {
        super(name, health);
        this.weapon = weapon;
        this.armour = armour;
    }
}
