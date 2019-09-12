package characters;

import org.junit.Before;
import org.junit.Test;
import powers.HealingItemType;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void setUp() {
        cleric = new Cleric("Lame", HealingItemType.BERRIES);
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
}
