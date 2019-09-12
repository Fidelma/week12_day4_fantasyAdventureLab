package characters;

import powers.CreatureType;
import powers.SpellType;

public class Wizard extends Player {

    private SpellType spell;
    private CreatureType creature;

    public Wizard(String name, SpellType spell, CreatureType creature) {
        super(name);
        this.spell = spell;
        this.creature = creature;
    }
}
