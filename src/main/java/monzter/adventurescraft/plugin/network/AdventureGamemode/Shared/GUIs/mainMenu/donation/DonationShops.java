package monzter.adventurescraft.plugin.network.AdventureGamemode.Shared.GUIs.mainMenu.donation;

public enum DonationShops {
    SKINS("Skins"),
    BOOSTERS("Boosters"),
    CRATES("DropTables"),
    ;

    public final String name;

    DonationShops(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
