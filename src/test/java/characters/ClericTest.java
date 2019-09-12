package characters;

import Room.Room;
import org.junit.Before;
import org.junit.Test;
import powers.HealingItemType;
import powers.TreasureType;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Enemy enemy;
    Room room;

    @Before
    public void setUp() {
        cleric = new Cleric("Lame", HealingItemType.BERRIES);
        enemy = new Enemy("Destroy", 25);
        room = new Room("Certain Death", enemy, TreasureType.TAPESTRY);
    }

    @Test
    public void canGetHealingItemReplenishment() {
        assertEquals(5, cleric.getHealingItemReplenishment());
    }

    @Test
    public void canTakeDamage() {
        cleric.defend(20);
        assertEquals(80, cleric.getHealth(), 0.01);
    }

    @Test
    public void canBeKilled() {
        cleric.attemptQuest(room);
        assertEquals(0, cleric.getHealth(), 0.01);
        assertEquals(100, enemy.getHealth(), 0.01);
        assertEquals(false, cleric.isHealingItemAvailable());


    }
}
