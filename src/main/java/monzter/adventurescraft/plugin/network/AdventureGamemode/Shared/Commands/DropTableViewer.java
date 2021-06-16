package monzter.adventurescraft.plugin.network.AdventureGamemode.Shared.Commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Dependency;
import co.aikar.commands.annotation.Subcommand;
import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.OutlinePane;
import com.github.stefvanschie.inventoryframework.pane.PaginatedPane;
import com.github.stefvanschie.inventoryframework.pane.Pane;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import monzter.adventurescraft.plugin.AdventuresCraft;
import monzter.adventurescraft.plugin.network.AdventureGamemode.Shared.Commands.DropTables.Crates;
import monzter.adventurescraft.plugin.network.PrisonGamemode.shared.dropTables.ItemGenerator;
import monzter.adventurescraft.plugin.utilities.GUI.GUIHelper;
import monzter.adventurescraft.plugin.utilities.enums.CrateList;
import monzter.adventurescraft.plugin.utilities.mmoitems.DropTablesDelivery;
import net.Indyuce.mmoitems.MMOItems;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.List;

@CommandAlias("DropTableViewer")
public class DropTableViewer extends BaseCommand {

    @Dependency
    private final AdventuresCraft plugin;
    private final GUIHelper guiHelper;
    private final DropTablesDelivery dropTablesDelivery;
    private final MMOItems mmoItems;


    public DropTableViewer(AdventuresCraft plugin, GUIHelper guiHelper, DropTablesDelivery dropTablesDelivery, MMOItems mmoItems) {
        this.plugin = plugin;
        this.guiHelper = guiHelper;
        this.dropTablesDelivery = dropTablesDelivery;
        this.mmoItems = mmoItems;
    }
    int height = 6;
    @Subcommand("UndeadCrate|UNDEAD_BOX")
    private void undeadCrate(Player player) {
        height = 6;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Undead Crate"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.UNDEAD);
        createMenu(gui, guiContents, Material.GREEN_STAINED_GLASS_PANE);
        gui.show(player);
    }

    @Subcommand("HellCrate|HELL_BOX")
    private void hellCrate(Player player) {
        height = 6;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Hell Crate"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.HELL);
        createMenu(gui, guiContents, Material.RED_STAINED_GLASS_PANE);
        gui.show(player);
    }

    @Subcommand("ProfessionCrate|PROFESSION_BOOSTER_BOX")
    private void professionCrate(Player player) {
        height = 6;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Profession Crate"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.PROFESSION);
        createMenu(gui, guiContents, Material.CYAN_STAINED_GLASS_PANE);
        gui.show(player);
    }

    @Subcommand("MagicalCrate|MAGICAL_BOX")
    private void magicalBox(Player player) {
        height = 6;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Magical Box"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.MAGICAL);
        createMenu(gui, guiContents, Material.PURPLE_STAINED_GLASS_PANE);
        gui.show(player);
    }

    @Subcommand("BorgCrate|BORGS_BOX")
    private void borgBox(Player player) {
        height = 5;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Borg's Box"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.BORG);
        createMenu(gui, guiContents, Material.RED_STAINED_GLASS_PANE, height, 1);
        gui.show(player);
    }

    @Subcommand("ENCHANTED_BOX")
    private void enchantedBox(Player player) {
        height = 3;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Enchanted Box"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.ENCHANTED_BOX);
        createMenu(gui, guiContents, Material.PURPLE_STAINED_GLASS_PANE, height, 2);
        gui.show(player);
    }

    @Subcommand("ENCHANTED_BOX2")
    private void enchantedBox2(Player player) {
        height = 3;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Enchanted Box"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.ENCHANTED_BOX2);
        createMenu(gui, guiContents, Material.PURPLE_STAINED_GLASS_PANE, height, 2);
        gui.show(player);
    }

    @Subcommand("ENCHANTED_BOX3")
    private void enchantedBox3(Player player) {
        height = 3;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Enchanted Box"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.ENCHANTED_BOX3);
        createMenu(gui, guiContents, Material.PURPLE_STAINED_GLASS_PANE, height, 3);
        gui.show(player);
    }

    @Subcommand("Reaper")
    private void reaper(Player player) {
        height = 3;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Reaper"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.REAPER);
        createMenu(gui, guiContents, Material.RED_STAINED_GLASS_PANE, height, 2);
        gui.show(player);
    }

    @Subcommand("Morden")
    private void morden(Player player) {
        height = 4;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Morden"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.MORDEN);
        createMenu(gui, guiContents, Material.RED_STAINED_GLASS_PANE, height, 1);
        gui.show(player);
    }

    @Subcommand("Dracula|VoidDracula")
    private void voidDracula(Player player) {
        height = 3;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Dracula"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.VOID_DRACULA);
        createMenu(gui, guiContents, Material.RED_STAINED_GLASS_PANE, height, 1);
        gui.show(player);
    }

    @Subcommand("Dryad")
    private void dryad(Player player) {
        height = 3;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Dryad"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.DRYAD);
        createMenu(gui, guiContents, Material.RED_STAINED_GLASS_PANE, height, 1);
        gui.show(player);
    }

    @Subcommand("GoblinChief")
    private void goblinChief(Player player) {
        height = 3;
        final ChestGui gui = new ChestGui(height, guiHelper.guiName("Dryad"));
        final List<Crates> guiContents = Crates.getCrates(CrateList.DRYAD);
        createMenu(gui, guiContents, Material.RED_STAINED_GLASS_PANE, height, 1);
        gui.show(player);
    }

    private void createMenu(ChestGui gui, Collection<? extends ItemGenerator> guiContents, Material backgroundColor) {
        createMenu(gui, guiContents, backgroundColor, 6, 1);
    }

    private void createMenu(ChestGui gui, Collection<? extends ItemGenerator> guiContents, Material backgroundColor, int height, int startX) {
        gui.setOnGlobalClick(event -> event.setCancelled(true));

        PaginatedPane page = new PaginatedPane(0, 0, 9, height);
        OutlinePane background = new OutlinePane(0, 0, 9, height, Pane.Priority.LOWEST);
        OutlinePane display = new OutlinePane(startX, 1, 7, 4, Pane.Priority.LOW);
        OutlinePane display2 = new OutlinePane(startX, 1, 7, 4, Pane.Priority.LOW);
        StaticPane back = new StaticPane(0, 5, 1, 1, Pane.Priority.HIGH);
        StaticPane forward = new StaticPane(8, 5, 1, 1, Pane.Priority.HIGH);

        page.addPane(0, background);
        page.addPane(0, display);
        page.addPane(1, background);
        page.addPane(1, display2);

        background.addItem(new GuiItem(guiHelper.background(backgroundColor)));
        background.setRepeat(true);

        int i = 0;

        for (ItemGenerator item : guiContents) {
            if (i < 28) {
                display.addItem(new GuiItem(item.generateItem()));
                i++;
            } else {
                display2.addItem(new GuiItem(item.generateItem()));
            }
        }
        if (!display2.getItems().isEmpty()) {
            back.addItem(new GuiItem((guiHelper.previousPageButton()), event -> {
                page.setPage(page.getPage() - 1);
                if (page.getPage() == 0) {
                    back.setVisible(false);
                }
                forward.setVisible(true);
                gui.update();
            }), 0, 0);
            back.setVisible(false);
            forward.addItem(new GuiItem((guiHelper.nextPageButton()), event -> {
                page.setPage(page.getPage() + 1);
                if (page.getPage() == page.getPages() - 1) {
                    forward.setVisible(false);
                }
                back.setVisible(true);
                gui.update();
            }), 0, 0);
        }

        gui.addPane(page);
        gui.addPane(back);
        gui.addPane(forward);
    }
}

