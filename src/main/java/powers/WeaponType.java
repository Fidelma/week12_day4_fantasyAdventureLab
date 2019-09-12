package powers;

public enum WeaponType {
    BLADE(35),
    CROSSBOW(60),
    SWORD(45);

    private final int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
