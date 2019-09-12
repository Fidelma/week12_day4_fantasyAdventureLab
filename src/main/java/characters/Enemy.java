package characters;

public class Enemy extends GameCharacter {

    private double damage;

    public Enemy(String name, double damage) {
        super(name);
        this.damage = damage;
    }

    public void defend(double damage) {
        this.health -= damage;
    }

    public double getDamage() {
        return this.damage;
    }
}
