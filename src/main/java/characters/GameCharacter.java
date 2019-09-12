package characters;

import behaviours.IDefend;

import java.util.ArrayList;

public abstract class GameCharacter implements IDefend {

    protected String name;
    protected double health;

    public GameCharacter(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }
}
