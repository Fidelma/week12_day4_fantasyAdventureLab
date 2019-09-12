package characters;

public class Enemy extends GameCharacter {

    private int damage;

    public Enemy(String name, int damage) {
        super(name);
        this.damage = damage;
    }
}
