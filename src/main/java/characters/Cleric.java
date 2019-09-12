package characters;

import Room.Room;
import behaviours.IDefend;
import powers.HealingItemType;

public class Cleric extends Player {

    private HealingItemType healingItem;
    private boolean healingItemAvailable;

    public Cleric(String name, HealingItemType healingItem) {
        super(name);
        this.healingItem = healingItem;
        this.healingItemAvailable = true;
    }

    public int getHealingItemReplenishment() {
        return this.healingItem.getReplenishment();
    }

    public void defend(double damage) {
        this.health -= damage;
        if(this.health < 0){
            this.health = 0;
        }
    }

    public double getDamage() {
        return 0;
    }

    public boolean isHealingItemAvailable() {
        return healingItemAvailable;
    }

    public void attemptQuest(Room room) {
        Enemy enemy = room.getEnemy();
        while (enemy.getHealth() > 0 && this.health > 0){
            defend(enemy.getDamage());
        if(this.health == 0 && healingItemAvailable) {
            this.health += healingItem.getReplenishment();
            this.healingItemAvailable = false;
        }
        }
        if(this.health > 0 && enemy.getHealth() == 0){
            inventory.add(room.getTreasure());
        }
    }
}
