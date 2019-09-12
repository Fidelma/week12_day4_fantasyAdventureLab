package Room;

import characters.Enemy;
import powers.TreasureType;

public class Room {

    private String name;
    private Enemy enemy;
    private TreasureType treasure;

    public Room(String name, Enemy enemy, TreasureType treasure){
        this.name = name;
        this.enemy = enemy;
        this.treasure = treasure;
    }


    public String getName() {
        return name;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public TreasureType getTreasure() {
        return treasure;
    }
}
