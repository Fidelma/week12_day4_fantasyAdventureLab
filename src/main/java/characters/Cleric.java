package characters;

import powers.HealingItemType;

public class Cleric extends Player {

    private HealingItemType healingItem;

    public Cleric(String name, HealingItemType healingItem) {
        super(name);
        this.healingItem = healingItem;
    }

}
