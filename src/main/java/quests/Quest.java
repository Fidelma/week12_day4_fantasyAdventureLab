package quests;

import Room.Room;

import java.util.ArrayList;

public class Quest {

    private ArrayList<Room> rooms;

    public Quest(){
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public int numberOfRooms() {
        return this.rooms.size();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Room getRoom(int i) {
        return rooms.get(i);
    }
}
