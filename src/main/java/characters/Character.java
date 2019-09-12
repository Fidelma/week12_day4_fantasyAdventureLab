package characters;

import java.util.ArrayList;

public abstract class Character {

    private String name;
    private double health;
    private ArrayList<IInventory> inventory;

    public Character(String name, double health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<IInventory>();
    }

}
