package monzter.adventurescraft.plugin.utilities.general.Purchase;

import io.lumine.mythic.lib.api.item.NBTItem;
import me.clip.placeholderapi.PlaceholderAPI;
import monzter.adventurescraft.plugin.network.AdventureGamemode.Shared.GUIs.mainMenu.donation.DonationItemList;
import monzter.adventurescraft.plugin.network.AdventureGamemode.Shared.GUIs.shops.npcs.ItemList;
import monzter.adventurescraft.plugin.utilities.beton.BetonPointsManager;
import monzter.adventurescraft.plugin.utilities.enums.PrisonStatsDisplay;
import monzter.adventurescraft.plugin.utilities.general.FullInventory;
import monzter.adventurescraft.plugin.utilities.general.SoundManager;
import monzter.adventurescraft.plugin.utilities.text.NumberFormat;
import monzter.adventurescraft.plugin.utilities.vault.Economy;
import net.Indyuce.mmoitems.MMOItems;
import net.Indyuce.mmoitems.api.event.CraftMMOItemEvent;
import net.Indyuce.mmoitems.api.player.PlayerData;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import pl.betoncraft.betonquest.BetonQuest;

public class PurchaseUtilsImpl implements PurchaseUtils {
    private final Economy economy;
    private final FullInventory fullInventory;
    private final SoundManager soundManager;
    private final NumberFormat numberFormat;
    private final MMOItems mmoItems;
    private final BetonPointsManager betonPointsManager;
    private final ShopBuilder shopBuilder;


    public PurchaseUtilsImpl(Economy economy, FullInventory fullInventory, SoundManager soundManager, NumberFormat numberFormat, MMOItems mmoItems, BetonPointsManager betonPointsManager, ShopBuilder shopBuilder) {
        this.economy = economy;
        this.fullInventory = fullInventory;
        this.soundManager = soundManager;
        this.numberFormat = numberFormat;
        this.mmoItems = mmoItems;
        this.betonPointsManager = betonPointsManager;
        this.shopBuilder = shopBuilder;
    }

    @Override
    public void purchase(Player player, ItemList itemList, int amount) {
        if (hasBasicCheck(player, itemList, amount) && !fullInventory.fullInventory(player)) {
            if (itemList.getItemPrice() != null)
                if (hasItem(player, itemList.getItemPrice(), amount)) {
                    for (ItemStack item : itemList.getItemPrice()) {
                        NBTItem nbtItem = NBTItem.get(item);
                        if (nbtItem.hasType()) {
                            String costID = mmoItems.getID(nbtItem).toString();
                            String costType = mmoItems.getType(nbtItem).toString();
                            int price = item.getAmount() * amount;
                            for (ItemStack currentItem : player.getInventory().getContents()) {
                                //        Cancels loop once price has been fulfilled (Could probably set to == instead of <=)
                                if (price <= 0)
                                    break;
                                NBTItem nbtcurrentItem = NBTItem.get(currentItem);
                                if (nbtcurrentItem.hasType()) {
                                    String ID = mmoItems.getID(nbtcurrentItem).toString();
                                    String type = mmoItems.getType(nbtcurrentItem).toString();
                                    if (ID.equalsIgnoreCase(costID) && type.equalsIgnoreCase(costType)) {
//                                    If the current price is less than the ItemStack's Quantity, it'll only take the amount it needs
                                        if (price > 0 && currentItem.getAmount() - price >= 0) {
                                            currentItem.setAmount(currentItem.getAmount() - price);
                                            price -= price;
//                                    Otherwise it'll take the full stack & for loop resets
                                        } else if (price > 0) {
                                            price -= currentItem.getAmount();
                                            currentItem.setAmount(0);
                                        }
                                    }
                                }
                            }
                        } else {
//                            This is for Vanilla Materials
                            int price = item.getAmount() * amount;
                            for (ItemStack currentItem : player.getInventory().getContents()) {
                                //        Cancels loop once price has been fulfilled (Could probably set to == instead of <=)
                                if (price <= 0)
                                    break;
                                if (currentItem != null && !NBTItem.get(currentItem).hasType() && item.getType() == currentItem.getType()) {
//                                    If the current price is less than the ItemStack's Quantity, it'll only take the amount it needs
                                    if (price > 0 && currentItem.getAmount() - price >= 0) {
                                        currentItem.setAmount(currentItem.getAmount() - price);
                                        price -= price;
//                                    Otherwise it'll take the full stack & for loop resets
                                    } else if (price > 0) {
                                        price -= currentItem.getAmount();
                                        currentItem.setAmount(0);
                                    }
                                }
                            }

                        }
                    }
                }
            if (itemList.getCoinPrice() > 0)
                economy.takeMoney(player, itemList.getCoinPrice() * amount);

            String displayName = itemList.getItemStack().getItemMeta().getDisplayName();
            if (displayName.isEmpty())
                displayName = itemList.getItemStack().getI18NDisplayName();

            player.sendMessage(ChatColor.GREEN + "You purchased " + ChatColor.GOLD + amount * itemList.getItemStack().getAmount() + "x " + ChatColor.YELLOW + displayName + ChatColor.GREEN + " for:");
            if (itemList.getItemPrice() != null)
                for (ItemStack itemPrice : itemList.getItemPrice()) {
                    String itemDisplayName = itemPrice.getItemMeta().getDisplayName();
                    if (itemDisplayName.isEmpty())
                        itemDisplayName = itemPrice.getI18NDisplayName();
                    player.sendMessage(ChatColor.DARK_GRAY.toString() + ChatColor.BOLD + "- " + ChatColor.GOLD + itemPrice.getAmount() + "x " + itemDisplayName);
                }
            player.getInventory().addItem(itemList.getItemStack().asQuantity(amount * itemList.getItemStack().getAmount()));
            soundManager.soundYes(player, 1);
//            PurchaseEvent purchaseEvent = new PurchaseEvent(player, itemList.getItemStack(), amount);
//            Bukkit.getServer().getPluginManager().callEvent(purchaseEvent);

//  This is for BetonQuest `mmoitemcraft` Objective
            if (NBTItem.get(itemList.getItemStack()).hasType()) {
                CraftMMOItemEvent craftMMOItemEvent = new CraftMMOItemEvent(PlayerData.get(player.getUniqueId()), itemList.getItemStack());
                Bukkit.getServer().getPluginManager().callEvent(craftMMOItemEvent);
            }
        }

    }

    //    Donation Shop
    public void purchase(Player player, DonationItemList itemList, int amount) {
        int balance = betonPointsManager.getPoints("items.AdventureCoin", BetonQuest.getInstance().getPlayerData(player.getUniqueId().toString()).getPoints());
        System.out.println("v" + balance);

        if (balance >= itemList.getAcPrice() * amount) {
            if (!fullInventory.fullInventory(player)) {
                player.sendMessage(ChatColor.GREEN + "You purchased " + ChatColor.GOLD + amount + "x " + ChatColor.YELLOW +
                        mmoItems.getItem(itemList.getType(), itemList.getID()).getItemMeta().getDisplayName() + ChatColor.GREEN + " for:");
                player.getInventory().addItem(mmoItems.getItem(itemList.getType(), itemList.getID()).asQuantity(amount));
                if (itemList.getAcPrice() > 0) {
                    betonPointsManager.takePointACs(player, itemList.getAcPrice() * amount);
                    player.sendMessage(ChatColor.GOLD + numberFormat.numberFormat(itemList.getAcPrice() * amount) + " " + PrisonStatsDisplay.ADVENTURE_COINS.getName() + ChatColor.RED + " have been deducted from your account!");
                    soundManager.soundYes(player, 1);
                }
            }
        }
    }

    //    Basic checks for Eco & Levels
    public boolean hasBasicCheck(Player player, ItemList itemList, int amount) {
        if (economy.getBalance(player) < (itemList.getCoinPrice() * amount))
            return false;
        if (itemList.getProfessionLevel() != null)
            for (String profession : itemList.getProfessionLevel())
                if (!professionCheck(player, profession))
                    return false;
        return true;
    }

    @Override
    public boolean hasItem(Player player, ItemStack[] items, int purchaseAmount) {
//        Loops through all Items (Cost)
        for (ItemStack item : items) {
//        Creates a variable to count how many of that item is within the inventory]
            NBTItem nbtItem = NBTItem.get(item);
            if (nbtItem.hasType()) {
                String costID = mmoItems.getID(nbtItem).toString();
                String costType = mmoItems.getType(nbtItem).toString();
                int totalInInv = 0;
                //        Loops through Player's inventory
                for (ItemStack currentItem : player.getInventory().getContents()) {
                    NBTItem nbtcurrentItem = NBTItem.get(currentItem);
                    if (nbtcurrentItem.hasType()) {
                        String ID = mmoItems.getID(nbtcurrentItem).toString();
                        String type = mmoItems.getType(nbtcurrentItem).toString();
                        if (ID.equalsIgnoreCase(costID) && type.equalsIgnoreCase(costType)) {
                            //        If the item is found within the inventory, the ItemStack amount is added to total
                            totalInInv += currentItem.getAmount();
                        }
                    }
                }
                //        If total amount of the costing ItemStack is within the Inventory, returns false
                if (totalInInv < (item.getAmount() * purchaseAmount))
                    return false;
            } else {
                int totalInInv = 0;
                //        Loops through Player's inventory
                for (ItemStack currentItem : player.getInventory().getContents()) {
                    if (currentItem != null && !NBTItem.get(currentItem).hasType() && item.getType() == currentItem.getType()) {
                        //        If the item is found within the inventory, the ItemStack amount is added to total
                        totalInInv += currentItem.getAmount();
                    }
                }
                //        If total amount of the costing ItemStack is within the Inventory, returns false
                if (totalInInv < (item.getAmount() * purchaseAmount))
                    return false;
            }
        }
        //        Otherwise return true because all items passed the check
        return true;
    }

    @Override
    public boolean professionCheck(Player player, String profession) {
        String[] professionLevelSplit = profession.split(",");
        String professionName = professionLevelSplit[0];
        int professionLevel = Integer.valueOf(professionLevelSplit[1]);
        int playerLevel = Integer.valueOf(PlaceholderAPI.setPlaceholders(player.getPlayer(), "%mmocore_profession_" + professionName + "%"));
        if (playerLevel >= professionLevel)
            return true;
        return false;
    }

}
