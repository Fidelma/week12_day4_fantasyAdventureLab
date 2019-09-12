package characters;

import org.junit.Before;
import org.junit.Test;
import powers.ArmourType;
import powers.TreasureType;
import powers.WeaponType;
import Room.Room;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Enemy enemy;
    Enemy enemy2;
    Room room;
    Room room2;


    @Before
    public void setUp(){
        knight = new Knight("Lancelot", WeaponType.SWORD, ArmourType.BODY);
        enemy = new Enemy("Trouble", 50);
        enemy2 = new Enemy("Double Trouble", 400);
        room = new Room("Forrest", enemy, TreasureType.TAPESTRY);
        room2 = new Room("Aztec", enemy2, TreasureType.TAPESTRY);
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

    @Test
    public void canCompleteQuest() {
        knight.attemptQuest(room);
        assertEquals(0, enemy.getHealth(), 0.01);
        assertEquals(1, knight.getInventory().size());
        assertEquals(62.5, knight.getHealth(), 0.01);

    }

    @Test
    public void canFailQuest() {
        knight.attemptQuest(room2);
        assertEquals(55, enemy2.getHealth(), 0.01);
        assertEquals(0, knight.getInventory().size());
        assertEquals(0, knight.getHealth(), 0.01);
    }
}
