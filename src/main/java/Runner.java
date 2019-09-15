import Room.Room;
import characters.Cleric;
import characters.Enemy;
import characters.Knight;
import characters.Player;
import powers.ArmourType;
import powers.TreasureType;
import powers.WeaponType;
import quests.Quest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Quest quest = new Quest();
        Enemy enemy1 = new Enemy("trouble", 10);
        Enemy enemy2 = new Enemy("double trouble", 30);
        Enemy enemy3 = new Enemy("lamo", 10);
        Room room1 = new Room("Certain death", enemy1, TreasureType.TAPESTRY);
        Room room2 = new Room("Possible death", enemy2, TreasureType.GEM);
        Room room3 = new Room("light at the end of the tunnel", enemy3, TreasureType.MOONSTONE);


        quest.addRoom(room1);
        quest.addRoom(room2);
        quest.addRoom(room3);

        System.out.println("Welcome to fantasy adventure");
        System.out.println("Please enter your name: ");
        String playerName = scanner.next();

        Knight player = new Knight(playerName, WeaponType.BLADE, ArmourType.SHIELD);

        int numberOfRooms = quest.numberOfRooms();
        int roomsCompleted = 0;
        while(player.isAlive() && roomsCompleted < numberOfRooms) {
            for (int i = 0; i < numberOfRooms; i++) {
                player.attemptQuest(quest.getRoom(i));
                if (player.isAlive()) {
                    roomsCompleted += 1;
                    System.out.println("would you like to try and upgrade your weapon or armour? (weapon/armour)");
                    String response = scanner.next();
                    if (response.equalsIgnoreCase("weapon")) {
                        System.out.println("sword or crossbow?");

                    } else {
                        System.out.println("helmet or body?");
                    }
                    String itemToBuy = scanner.next();
                    if (itemToBuy.equalsIgnoreCase("sword")) {
                        player.buyWeapon(WeaponType.SWORD);
                    } else if (itemToBuy.equalsIgnoreCase("crossbow")) {
                        player.buyWeapon(WeaponType.CROSSBOW);
                    } else if (itemToBuy.equalsIgnoreCase("helmet")) {
                        player.buyArmour(ArmourType.HELMET);
                    } else {
                        player.buyArmour(ArmourType.BODY);
                    }
                }
            }
        }
        String endOfGame;
        if (player.isAlive()){
            endOfGame = "Quest completed. Well done!";
        } else {
            endOfGame = String.format("You have failed this quest you only completed %s out %s rooms", roomsCompleted, numberOfRooms);
        }
        System.out.println(endOfGame);


    }
}
