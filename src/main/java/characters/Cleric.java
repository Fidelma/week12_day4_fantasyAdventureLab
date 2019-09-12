package characters;

import behaviours.IDefend;
import powers.HealingItemType;

public class Cleric extends Player {

    private HealingItemType healingItem;

    public Cleric(String name, HealingItemType healingItem) {
        super(name);
        this.healingItem = healingItem;
    }

    public int getHealingItemReplenishment() {
        return this.healingItem.getReplenishment();
    }

    public void defend(double damage) {
        this.health -= damage;
    }

    public double getDamage() {
        return 0;
    }


}
