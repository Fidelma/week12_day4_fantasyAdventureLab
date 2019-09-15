import Room.Room;
import characters.Enemy;
import org.junit.Before;
import org.junit.Test;
import powers.TreasureType;
import quests.Quest;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    Enemy enemy;
    Room room1;
    Room room2;
    Room room3;
    Room room4;
    Quest quest;

    @Before
    public void before(){
        enemy = new Enemy("double trouble", 50);
        room1 = new Room("certain death", enemy, TreasureType.TAPESTRY);
        room2 = new Room("Death likely", enemy, TreasureType.TAPESTRY);
        room3 = new Room("dark", enemy, TreasureType.TAPESTRY);
        room4 = new Room("dark and deadly", enemy, TreasureType.TAPESTRY);
        quest = new Quest();
    }

    @Test
    public void canAddRoom() {
        quest.addRoom(room1);
        quest.addRoom(room2);
        quest.addRoom(room3);
        quest.addRoom(room4);
        assertEquals(4, quest.numberOfRooms());
    }
}
