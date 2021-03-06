package monzter.adventurescraft.plugin.utilities.enums;

public enum PetEggList {
    COMMON("PET_EGG", 100),
    UNCOMMON("PET_EGG2", 500),
    RARE("PET_EGG3", 1000),
    LEGENDARY("PET_EGG4", 1500),
    EXOTIC("PET_EGG5", 2000),
    MYTHICAL("PET_EGG6", 10000),
    GODLY("PET_EGG6", 25000),
    PHOENIX("PHOENIX_EGG", 10000),
    PHOENIX2("PHOENIX_EGG2", 25000),
    DRAGON("DRAGON_EGG", 10000),
    DRAGON2("DRAGON_EGG2", 25000);

    public final String name;
    public final int expToHatch;

    PetEggList(String name, int expToHatch) {
        this.name = name;
        this.expToHatch = expToHatch;
    }

    public int getExpToHatch() {
        return expToHatch;
    }
}
