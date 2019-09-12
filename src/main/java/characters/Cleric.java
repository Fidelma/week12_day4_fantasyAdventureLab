package characters;

import powers.HealingItemType;

public class Cleric extends Player {

    private HealingItemType healingItem;

    public Cleric(String name, double health, HealingItemType healingItem) {
        super(name, health);
        this.healingItem = healingItem;
    }

}
