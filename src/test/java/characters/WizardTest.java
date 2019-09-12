package characters;

import org.junit.Before;
import org.junit.Test;
import powers.CreatureType;
import powers.SpellType;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Enemy enemy;

    @Before
    public void setUp() {
        wizard = new Wizard("Merlin", SpellType.FROGFLARE, CreatureType.PHOENIX);
        enemy = new Enemy("Double Trouble", 45);
    }

    @Test
    public void canGetCreatureResistance() {
        assertEquals(2, wizard.getCreatureResistance());
    }

    @Test
    public void canGetSpellDamage() {
        assertEquals(30, wizard.getSpellDamage());
    }

    @Test
    public void canAttack() {
        wizard.attack(enemy);
        assertEquals(77.5, wizard.getHealth(),0.01);
        assertEquals(70, enemy.getHealth(), 0.01);
    }
}
