package characters;

import powers.TreasureType;

import java.util.ArrayList;
import java.util.BitSet;

public abstract class Player extends GameCharacter {

    protected ArrayList<IInventory> inventory;
    protected ArrayList<TreasureType> treasure;
    protected boolean alive;

    public Player(String name) {
        super(name);
        this.inventory = new ArrayList<IInventory>();
        this.treasure = new ArrayList<TreasureType>();
        this.alive = true;


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

   public int getValueOfTreasure(){
        int totalValue = 0;
        for(TreasureType item : treasure){
            totalValue += item.getValue();
        }
       return totalValue;
   }

    public ArrayList<TreasureType> getTreasure() {
        return treasure;
    }
}
