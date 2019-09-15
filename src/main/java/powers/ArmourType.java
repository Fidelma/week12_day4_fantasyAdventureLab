package powers;

import characters.IInventory;

public enum ArmourType implements IInventory {
    SHIELD(2, 10),
    HELMET(3, 15),
    BODY(4, 50);



    private final int resistance;
    private final int price;

    ArmourType(int resistance, int price) {
        this.resistance = resistance;
        this.price = price;
    }

    public int getResistance(){
        return this.resistance;
    }

    public int getPrice(){
        return this.price;
    }


}




