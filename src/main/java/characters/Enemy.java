package characters;

public class Enemy extends GameCharacter {

    private int damage;

    public Enemy(String name, double health, int damage) {
        super(name, health);
        this.damage = damage;
    }
}
