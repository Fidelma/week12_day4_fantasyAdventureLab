package powers;

import characters.IInventory;

public enum TreasureType implements IInventory {

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
