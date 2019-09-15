package powers;

public enum WeaponType {
    BLADE(35, 20),
    CROSSBOW(60, 50),
    SWORD(45, 35);

    private final int damage;
    private final int price;

    WeaponType(int damage, int price){
        this.damage = damage;
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public int getPrice() {
        return price;
    }
}
