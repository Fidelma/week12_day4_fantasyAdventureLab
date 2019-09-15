package characters;

import Room.Room;
import behaviours.IAttack;
import behaviours.IDefend;
import powers.ArmourType;
import powers.TreasureType;
import powers.WeaponType;

import java.util.ArrayList;

public class Knight extends Player implements IAttack {

    private WeaponType weapon;
    private ArmourType armour;


    public Knight(String name, WeaponType weapon, ArmourType armour) {
        super(name);
        this.weapon = weapon;
       this.armour = armour;
    }

    public WeaponType getWeapon() {
        return this.weapon;
    }

    public int getWeaponDamage() {
        return this.weapon.getDamage();
    }

    public int getArmourResistance() {
        return this.armour.getResistance();
    }

    public void attack(IDefend character) {
        character.defend(getDamage());
        defend(character.getDamage());
    }

    public void defend(double damage) {
        this.health -= damage/getArmourResistance();
        if(this.health < 0){
            this.health = 0;
        }
    }

    public double getDamage() {
        return getWeaponDamage();
    }


    public void attemptQuest(Room room) {
        Enemy enemy = room.getEnemy();
        while (enemy.getHealth() > 0 && this.health > 0){
            attack(enemy);
        }
        if(this.health > 0 && enemy.getHealth() == 0){
            treasure.add(room.getTreasure());
        }else {
            this.alive = false;
        }
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public void setArmour(ArmourType armour) {
        this.armour = armour;
    }

    public void buyArmour(ArmourType armour){
        int moneyAvailable = getValueOfTreasure();
        if(moneyAvailable >= armour.getPrice()){
            setArmour(armour);
            this.treasure.clear();
        }
    }

    public void buyWeapon(WeaponType weapon) {
        int moneyAvailable = getValueOfTreasure();
        if(moneyAvailable >= weapon.getPrice()){
            setWeapon(weapon);
            this.treasure.clear();
        }
    }

    public boolean isAlive() {
        return alive;
    }
}
