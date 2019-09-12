package characters;

import java.util.ArrayList;

public abstract class GameCharacter {

    protected String name;
    protected double health;

    public GameCharacter(String name) {
        this.name = name;
        this.health = 100;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }
}
