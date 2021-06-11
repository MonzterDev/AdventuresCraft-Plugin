package monzter.adventurescraft.plugin.utilities.GUI;

import dev.dbassett.skullcreator.SkullCreator;
import monzter.adventurescraft.plugin.utilities.enums.Linebreak;
import monzter.adventurescraft.plugin.utilities.enums.Prefix;
import monzter.adventurescraft.plugin.utilities.enums.PrisonStatsDisplay;
import monzter.adventurescraft.plugin.utilities.text.NumberFormat;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GUIHelperImpl implements GUIHelper {
    private final NumberFormat numberFormat;

    public GUIHelperImpl(NumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

//    Background

    @Override
    public ItemStack background() {
        final ItemStack backgroundItem = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        final ItemMeta backgroundItemMeta = backgroundItem.getItemMeta();

        backgroundItemMeta.displayName(Component.text(" "));
        backgroundItem.setItemMeta(backgroundItemMeta);
        return backgroundItem;
    }

    @Override
    public ItemStack background(Material material) {
        final ItemStack backgroundItem = new ItemStack(material);
        final ItemMeta backgroundItemMeta = backgroundItem.getItemMeta();

        backgroundItemMeta.displayName(Component.text(" "));
        backgroundItem.setItemMeta(backgroundItemMeta);
        return backgroundItem;
    }

//    Buttons

    @Override
    public ItemStack backButton() {
        final ItemStack backButton = new ItemStack(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY1MmUyYjkzNmNhODAyNmJkMjg2NTFkN2M5ZjI4MTlkMmU5MjM2OTc3MzRkMThkZmRiMTM1NTBmOGZkYWQ1ZiJ9fX0="));
        final ItemMeta backButtonItemMeta = backButton.getItemMeta();

        backButtonItemMeta.displayName(Component.text(ChatColor.GREEN + "Go Back"));
        backButton.setItemMeta(backButtonItemMeta);
        return backButton;
    }

    @Override
    public ItemStack nextPageButton() {
        final ItemStack nextPageItem = new ItemStack(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjhmNjgxZGFhZDhiZjQzNmNhZThkYTNmZTgxMzFmNjJhMTYyYWI4MWFmNjM5YzNlMDY0NGFhNmFiYWMyZiJ9fX0="));
        final ItemMeta nextPageItemMeta = nextPageItem.getItemMeta();

        nextPageItemMeta.displayName(Component.text(ChatColor.GREEN + "Next Page"));
        nextPageItem.setItemMeta(nextPageItemMeta);
        return nextPageItem;
    }

    @Override
    public ItemStack previousPageButton() {
        final ItemStack previousPageItem = new ItemStack(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY1MmUyYjkzNmNhODAyNmJkMjg2NTFkN2M5ZjI4MTlkMmU5MjM2OTc3MzRkMThkZmRiMTM1NTBmOGZkYWQ1ZiJ9fX0="));
        final ItemMeta previousPageItemMeta = previousPageItem.getItemMeta();

        previousPageItemMeta.displayName(Component.text(ChatColor.GREEN + "Previous Page"));
        previousPageItem.setItemMeta(previousPageItemMeta);
        return previousPageItem;
    }

    @Override
    public ItemStack firstPageButton() {
        final ItemStack firstPageItem = new ItemStack(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODE2ZWEzNGE2YTZlYzVjMDUxZTY5MzJmMWM0NzFiNzAxMmIyOThkMzhkMTc5ZjFiNDg3YzQxM2Y1MTk1OWNkNCJ9fX0="));
        final ItemMeta firstPageItemMeta = firstPageItem.getItemMeta();

        firstPageItemMeta.displayName(Component.text(ChatColor.GREEN + "First Page"));
        firstPageItem.setItemMeta(firstPageItemMeta);
        return firstPageItem;
    }

    @Override
    public ItemStack lastPageButton() {
        final ItemStack lastPageItem = new ItemStack(SkullCreator.itemFromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWM5ZWM3MWMxMDY4ZWM2ZTAzZDJjOTI4N2Y5ZGE5MTkzNjM5ZjNhNjM1ZTJmYmQ1ZDg3YzJmYWJlNjQ5OSJ9fX0="));
        final ItemMeta lastPageItemMeta = lastPageItem.getItemMeta();

        lastPageItemMeta.displayName(Component.text(ChatColor.GREEN + "Last Page"));
        lastPageItem.setItemMeta(lastPageItemMeta);
        return lastPageItem;
    }

//    Name

    @Override
    public String guiName(String name) {
        if (name.length() > 21)
            System.out.println("Your GUI '" + name + "' found within " + Thread.currentThread().getStackTrace()[2].getClassName().substring(31) + " is longer than what the inventory can NEATLY contain.");
        return
                ChatColor.WHITE.toString() + ChatColor.BOLD + "»" +
                        ChatColor.GRAY + ChatColor.BOLD + "» " +
                        ChatColor.DARK_GRAY + name +
                        ChatColor.GRAY + ChatColor.BOLD + " «" +
                        ChatColor.WHITE + ChatColor.BOLD + "«";
    }

    //    Item Builders

    @Override
    public ItemStack itemCreator(Material material, String name, String[] lore) {
        ItemStack complete = new ItemStack(material);
        return itemCreator(complete, name, lore);
    }

    @Override
    public ItemStack itemCreator(String skullTexture, String name, String[] lore) {
        ItemStack complete = SkullCreator.itemFromBase64(skullTexture);
        return itemCreator(complete, name, lore);
    }

    @Override
    public ItemStack itemCreator(ItemStack itemStack, String name, String[] lore) {
        ItemStack complete = itemStack;
        final ItemMeta completeItemMeta = complete.getItemMeta();
        completeItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        completeItemMeta.setDisplayName(name);

        List<String> itemLore = new ArrayList<>();
        for (String lore2 : lore)
            itemLore.add(lore2);

        complete.setItemMeta(completeItemMeta);
        complete.setLore(itemLore);

        return complete;
    }

    @Override
    public ItemStack questInactive(String questName, TextComponent[] questDescription, TextComponent[] questRewards, String questGiver, String questGiverArea) {
        ItemStack inactive = new ItemStack(Material.PAPER);
        final ItemMeta inactiveItemMeta = inactive.getItemMeta();

        inactiveItemMeta.displayName(Component.text(ChatColor.RED.toString() + ChatColor.BOLD + "[Inactive] " + ChatColor.WHITE + ChatColor.BOLD + questName));

        List<Component> lore = new ArrayList<>();
        lore.add(Linebreak.PREFIX.getComponent());
        for (TextComponent lore2 : questDescription)
            lore.add(lore2);
        lore.add(Linebreak.PREFIX.getComponent());
        lore.add(Component.text(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Rewards:"));
        for (TextComponent reward : questRewards)
            lore.add(Component.text(Prefix.PREFIX.getString()).append(reward).color(NamedTextColor.WHITE));
        lore.add(Linebreak.PREFIX.getComponent());
        lore.add(Component.text(ChatColor.GREEN + "Given by " + ChatColor.GOLD + questGiver + ChatColor.GREEN + " in the " + ChatColor.YELLOW + questGiverArea + ChatColor.GREEN + "!"));

        inactive.setItemMeta(inactiveItemMeta);
        inactive.lore(lore);

        return inactive;
    }

    @Override
    public ItemStack questInactive(String questName, String[] questDescription, String[] questRewards, String questGiver, String questGiverArea) {
        ItemStack inactive = new ItemStack(Material.PAPER);
        final ItemMeta inactiveItemMeta = inactive.getItemMeta();

        inactiveItemMeta.displayName(Component.text(ChatColor.RED.toString() + ChatColor.BOLD + "[Inactive] " + ChatColor.WHITE + ChatColor.BOLD + questName));

        List<String> lore = new ArrayList<>();
        lore.add("");
        for (String lore2 : questDescription)
            lore.add(lore2);
        lore.add("");
        lore.add(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Rewards:");
        for (String reward : questRewards)
            lore.add(Prefix.PREFIX.getString() + ChatColor.WHITE + reward);
        lore.add("");
        lore.add(ChatColor.GREEN + "Given by " + ChatColor.GOLD + questGiver + ChatColor.GREEN + " in the " + ChatColor.YELLOW + questGiverArea + ChatColor.GREEN + "!");

        inactive.setItemMeta(inactiveItemMeta);
        inactive.setLore(lore);

        return inactive;
    }

    @Override
    public ItemStack questActive(String questName, TextComponent[] questDescription, TextComponent[] questRewards, String questGiver, String questGiverArea) {
        ItemStack active = new ItemStack(Material.BOOK);
        final ItemMeta activeItemMeta = active.getItemMeta();

        activeItemMeta.displayName(Component.text(ChatColor.GOLD.toString() + ChatColor.BOLD + "[Active] " + ChatColor.WHITE + ChatColor.BOLD + questName));

        List<Component> lore = new ArrayList<>();
        lore.add(Linebreak.PREFIX.getComponent());
        for (TextComponent lore2 : questDescription)
            lore.add(lore2);
        lore.add(Linebreak.PREFIX.getComponent());
        lore.add(Component.text(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Rewards:"));
        for (TextComponent reward : questRewards)
            lore.add(Component.text(Prefix.PREFIX.getString()).append(reward).color(NamedTextColor.WHITE));
        lore.add(Linebreak.PREFIX.getComponent());
        lore.add(Component.text(ChatColor.GREEN + "Given by " + ChatColor.GOLD + questGiver + ChatColor.GREEN + " in the " + ChatColor.YELLOW + questGiverArea + ChatColor.GREEN + "!"));

        active.setItemMeta(activeItemMeta);
        active.lore(lore);

        return active;
    }

    @Override
    public ItemStack questActive(String questName, String[] questDescription, String[] questRewards, String questGiver, String questGiverArea) {
        ItemStack active = new ItemStack(Material.BOOK);
        final ItemMeta activeItemMeta = active.getItemMeta();

        activeItemMeta.displayName(Component.text(ChatColor.GOLD.toString() + ChatColor.BOLD + "[Active] " + ChatColor.WHITE + ChatColor.BOLD + questName));

        List<String> lore = new ArrayList<>();
        lore.add("");
        for (String lore2 : questDescription)
            lore.add(lore2);
        lore.add("");
        lore.add(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Rewards:");
        for (String reward : questRewards)
            lore.add(Prefix.PREFIX.getString() + ChatColor.WHITE + reward);
        lore.add("");
        lore.add(ChatColor.GREEN + "Given by " + ChatColor.GOLD + questGiver + ChatColor.GREEN + " in the " + ChatColor.YELLOW + questGiverArea + ChatColor.GREEN + "!");

        active.setItemMeta(activeItemMeta);
        active.setLore(lore);

        return active;
    }

    @Override
    public ItemStack questComplete(String questName, TextComponent[] questDescription, TextComponent[] questRewards, String questGiver, String questGiverArea) {
        ItemStack complete = new ItemStack(Material.ENCHANTED_BOOK);
        final ItemMeta completeItemMeta = complete.getItemMeta();

        completeItemMeta.displayName(Component.text(ChatColor.GREEN.toString() + ChatColor.BOLD + "[Complete] " + ChatColor.WHITE + ChatColor.BOLD + questName));

        List<Component> lore = new ArrayList<>();
        lore.add(Linebreak.PREFIX.getComponent());
        for (TextComponent lore2 : questDescription)
            lore.add(lore2);
        lore.add(Linebreak.PREFIX.getComponent());
        lore.add(Component.text(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Rewards:"));
        for (TextComponent reward : questRewards)
            lore.add(Component.text(Prefix.PREFIX.getString()).append(reward).color(NamedTextColor.WHITE));
        lore.add(Linebreak.PREFIX.getComponent());
        lore.add(Component.text(ChatColor.GREEN + "Given by " + ChatColor.GOLD + questGiver + ChatColor.GREEN + " in the " + ChatColor.YELLOW + questGiverArea + ChatColor.GREEN + "!"));

        complete.setItemMeta(completeItemMeta);
        complete.lore(lore);

        return complete;
    }

    @Override
    public ItemStack questComplete(String questName, String[] questDescription, String[] questRewards, String questGiver, String questGiverArea) {
        ItemStack complete = new ItemStack(Material.ENCHANTED_BOOK);
        final ItemMeta completeItemMeta = complete.getItemMeta();

        completeItemMeta.displayName(Component.text(ChatColor.GREEN.toString() + ChatColor.BOLD + "[Complete] " + ChatColor.WHITE + ChatColor.BOLD + questName));

        List<String> lore = new ArrayList<>();
        lore.add("");
        for (String lore2 : questDescription)
            lore.add(lore2);
        lore.add("");
        lore.add(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Rewards:");
        for (String reward : questRewards)
            lore.add(Prefix.PREFIX.getString() + ChatColor.WHITE + reward);
        lore.add("");
        lore.add(ChatColor.GREEN + "Given by " + ChatColor.GOLD + questGiver + ChatColor.GREEN + " in the " + ChatColor.YELLOW + questGiverArea + ChatColor.GREEN + "!");

        complete.setItemMeta(completeItemMeta);
        complete.setLore(lore);

        return complete;
    }

    @Override
    public ItemStack questUnclaimed(String questName, String[] questDescription, String[] questRewards, String questGiver, String questGiverArea) {
        ItemStack unclaimed = new ItemStack(Material.ENCHANTED_BOOK);
        final ItemMeta unclaimedItemMeta = unclaimed.getItemMeta();

        unclaimedItemMeta.displayName(Component.text(ChatColor.GOLD.toString() + ChatColor.BOLD + "[Unclaimed] " + ChatColor.WHITE + ChatColor.BOLD + questName));

        List<String> lore = new ArrayList<>();
        lore.add("");
        for (String lore2 : questDescription)
            lore.add(lore2);
        lore.add("");
        lore.add(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Rewards:");
        for (String reward : questRewards)
            lore.add(Prefix.PREFIX.getString() + ChatColor.WHITE + reward);
        lore.add("");
        lore.add(ChatColor.GREEN + "Given by " + ChatColor.GOLD + questGiver + ChatColor.GREEN + " in the " + ChatColor.YELLOW + questGiverArea + ChatColor.GREEN + "!");
        lore.add("");
        lore.add(Prefix.PREFIX.getString() + ChatColor.YELLOW + "Click to Claim Rewards");

        unclaimed.setItemMeta(unclaimedItemMeta);
        unclaimed.setLore(lore);

        return unclaimed;
    }

    @Override
    public ItemStack jobActive(String questName, String questDescription, ItemStack[] questRewards, int[] rewardsAmount, String[] currencyRewards, int[] currencyRewardsAmount, String questGiver, String questGiverArea) {
        ItemStack unclaimed = new ItemStack(Material.PAPER);
        final ItemMeta unclaimedItemMeta = unclaimed.getItemMeta();

        unclaimedItemMeta.displayName(Component.text(ChatColor.GREEN.toString() + ChatColor.BOLD + "[Active] " + ChatColor.WHITE + ChatColor.BOLD + questName));

        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(questDescription);
        lore.add("");
        lore.add(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Rewards:");
        int reward = 0;
        for (ItemStack lore3 : questRewards) {
            if (lore3 != null) {
                lore.add("  " + Prefix.PREFIX.getString() + ChatColor.GOLD + rewardsAmount[reward] + "x " + lore3.getItemMeta().getDisplayName());
                reward++;
            }
        }

        int currency = 0;
        for (String lore2 : currencyRewards) {
            if (currencyRewards != null) {
                String newLore = "  " + Prefix.PREFIX.getString() + ChatColor.GOLD + numberFormat.numberFormat(currencyRewardsAmount[currency]) + " ";
                switch (lore2) {
                    case "exp":
                        lore.add(newLore + PrisonStatsDisplay.EXPERIENCE_AMOUNT.getName());
                        currency++;
                        break;
                    case "petexp":
                        lore.add(newLore + PrisonStatsDisplay.PET_EXPERIENCE_AMOUNT.getName());
                        currency++;
                        break;
                    case "miningpassexp":
                        lore.add(newLore + PrisonStatsDisplay.MINING_PASS_EXPERIENCE.getName());
                        currency++;
                        break;
                }
            }
        }
        lore.add("");
        lore.add(ChatColor.GREEN + "Given by " + ChatColor.GOLD + questGiver + ChatColor.GREEN + " in the " + ChatColor.YELLOW + questGiverArea + ChatColor.GREEN + "!");

        unclaimed.setItemMeta(unclaimedItemMeta);
        unclaimed.setLore(lore);

        return unclaimed;
    }

    @Override
    public ItemStack jobActive(String questName, String questDescription, ItemStack[] questRewards, int[] rewardsAmount, String[] currencyRewards, int[] currencyRewardsAmount, String resetTime) {
        ItemStack unclaimed = new ItemStack(Material.PAPER);
        final ItemMeta unclaimedItemMeta = unclaimed.getItemMeta();

        unclaimedItemMeta.displayName(Component.text(ChatColor.GREEN.toString() + ChatColor.BOLD + "[Active] " + ChatColor.WHITE + ChatColor.BOLD + questName));

        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(questDescription);
        lore.add("");
        lore.add(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Rewards:");
        int reward = 0;
        for (ItemStack lore3 : questRewards) {
            if (lore3 != null) {
                lore.add("  " + Prefix.PREFIX.getString() + ChatColor.GOLD + rewardsAmount[reward] + "x " + lore3.getItemMeta().getDisplayName());
                reward++;
            }
        }

        int currency = 0;
        for (String lore2 : currencyRewards) {
            if (currencyRewards != null) {
                String newLore = "  " + Prefix.PREFIX.getString() + ChatColor.GOLD + numberFormat.numberFormat(currencyRewardsAmount[currency]) + " ";
                switch (lore2) {
                    case "exp":
                        lore.add(newLore + PrisonStatsDisplay.EXPERIENCE_AMOUNT.getName());
                        currency++;
                        break;
                    case "petexp":
                        lore.add(newLore + PrisonStatsDisplay.PET_EXPERIENCE_AMOUNT.getName());
                        currency++;
                        break;
                    case "miningpassexp":
                        lore.add(newLore + PrisonStatsDisplay.MINING_PASS_EXPERIENCE.getName());
                        currency++;
                        break;
                }
            }
        }
        lore.add("");
        lore.add(ChatColor.GREEN + resetTime + ChatColor.YELLOW + " left until this Job resets!");

        unclaimed.setItemMeta(unclaimedItemMeta);
        unclaimed.setLore(lore);

        return unclaimed;
    }

}
