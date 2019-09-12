import characters.Enemy;
import org.junit.Before;
import org.junit.Test;
import powers.TreasureType;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Enemy enemy;

    @Before
    public void before() {
        enemy = new Enemy("trouble", 50);
        room = new Room("Forrest", enemy, TreasureType.TAPESTRY);
    }

    @Test
    public void canGetName() {
        assertEquals("Forrest", room.getName());
    }

    @Test
    public void canGetEnemy() {
        assertEquals(enemy, room.getEnemy());
    }

    @Test
    public void canGetTreasure() {
        assertEquals(TreasureType.TAPESTRY, room.getTreasure());
    }
}
