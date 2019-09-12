package characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Trouble", 50);
    }

    @Test
    public void canGetEnemyDamage() {
        assertEquals(50, enemy.getDamage());
    }
}
