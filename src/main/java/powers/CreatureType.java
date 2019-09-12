package powers;

public enum CreatureType {

    PHOENIX(2),
    DRAGON(4),
    UNICORN(1);

    private final int resistance;

    CreatureType(int resistance){
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }
}
