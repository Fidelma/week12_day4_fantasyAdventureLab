package characters;

import java.util.ArrayList;

public abstract class Player extends GameCharacter {

    protected ArrayList<IInventory> inventory;

    public Player(String name) {
        super(name);
        this.inventory = new ArrayList<IInventory>();
    }

    public ArrayList<IInventory> getInventory() {
        return inventory;
    }

    public void collect(IInventory item) {
        this.inventory.add(item);
    }

    public void heal(int replenishment) {
        this.health += replenishment;
    }

}
