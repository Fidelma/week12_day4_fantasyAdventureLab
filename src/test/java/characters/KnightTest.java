package characters;

import org.junit.Before;
import org.junit.Test;
import powers.ArmourType;
import powers.WeaponType;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Enemy enemy;

    @Before
    public void setUp(){
        knight = new Knight("Lancelot", WeaponType.SWORD, ArmourType.BODY);
        enemy = new Enemy("Trouble", 50);
    }

    @Test
    public void hasName() {
        assertEquals("Lancelot", knight.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, knight.getHealth(), 0.01);
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, knight.getInventory().size());
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.SWORD, knight.getWeapon());
    }

    @Test
    public void canGetWeaponDamage() {
        assertEquals(45, knight.getWeaponDamage());
    }

    @Test
    public void canGetArmourResistance() {
        assertEquals(4, knight.getArmourResistance());
    }

    @Test
    public void canAttack() {
        knight.attack(enemy);
        assertEquals(87.5, knight.getHealth(), 0.01);
        assertEquals(55, enemy.getHealth(), 0.01);
    }

}
