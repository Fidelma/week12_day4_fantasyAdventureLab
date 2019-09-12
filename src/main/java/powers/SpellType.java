package powers;

public enum SpellType {

    FROGFLARE(30),
    SUPERNOVA(40),
    EXPELLIARMUS(75);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
