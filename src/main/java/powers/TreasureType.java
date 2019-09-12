package powers;

public enum TreasureType {

    GEM(5),
    MOONSTONE(15),
    TAPESTRY(60);

    private final int value;

    TreasureType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
