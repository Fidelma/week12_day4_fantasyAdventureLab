package powers;

public enum HealingItemType {
    POTION(100),
    BERRIES(5),
    HERBS(45);

    private final int replenishment;

    HealingItemType(int replenishment){
        this.replenishment = replenishment;
    }

    public int getReplenishment() {
        return replenishment;
    }
}
