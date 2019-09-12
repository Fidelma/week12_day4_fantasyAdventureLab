package powers;

public enum ArmourType {
    SHIELD(2),
    HELMET(3),
    BODY(4);



    private final int resistance;

    ArmourType(int resistance) {
        this.resistance = resistance;
    }

    public int getResistance(){
        return this.resistance;
    }
}




