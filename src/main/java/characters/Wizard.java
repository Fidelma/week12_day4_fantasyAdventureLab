package characters;

import Room.Room;
import behaviours.IAttack;
import behaviours.IDefend;
import powers.CreatureType;
import powers.SpellType;

public class Wizard extends Player implements IAttack {

    private SpellType spell;
    private CreatureType creature;

    public Wizard(String name, SpellType spell, CreatureType creature) {
        super(name);
        this.spell = spell;
        this.creature = creature;
    }

    public int getCreatureResistance() {
        return this.creature.getResistance();
    }

    public int getSpellDamage() {
        return this.spell.getDamage();
    }

    public void defend(double damage) {
        this.health -= damage/getCreatureResistance();
        if(this.health < 0){
            this.health = 0;
        }

    }

    public double getDamage() {
        return getSpellDamage();
    }

    public void attack(IDefend character) {
        defend(character.getDamage());
        character.defend(getDamage());
    }

    public void attemptQuest(Room room) {
        Enemy enemy = room.getEnemy();
        while (enemy.getHealth() > 0 && this.health > 0){
            attack(enemy);
        }
        if(this.health > 0 && enemy.getHealth() == 0){
            inventory.add(room.getTreasure());
        }
    }
}
