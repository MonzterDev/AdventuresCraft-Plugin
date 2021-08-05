package monzter.adventurescraft.plugin.network.PrisonGamemode.shared.GUIs.mainMenu;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Dependency;
import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.OutlinePane;
import com.github.stefvanschie.inventoryframework.pane.Pane;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import me.clip.placeholderapi.PlaceholderAPI;
import monzter.adventurescraft.plugin.AdventuresCraft;
import monzter.adventurescraft.plugin.network.PrisonGamemode.shared.commands.dropTables.VoteRewardList;
import monzter.adventurescraft.plugin.utilities.GUI.GUIHelper;
import monzter.adventurescraft.plugin.utilities.beton.BetonPointsManager;
import monzter.adventurescraft.plugin.utilities.enums.Prefix;
import monzter.adventurescraft.plugin.utilities.general.ConsoleCommand;
import monzter.adventurescraft.plugin.utilities.general.SoundManager;
import monzter.adventurescraft.plugin.utilities.mmoitems.MMOItemsGive;
import net.Indyuce.mmoitems.MMOItems;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class VoteRewards extends BaseCommand {

    @Dependency
    private final AdventuresCraft plugin;
    private final SoundManager soundManager;
    private final GUIHelper guiHelper;
    private final ConsoleCommand consoleCommand;
    private final MMOItemsGive mmoItemsGive;
    private final BetonPointsManager betonPointsManager;
    final TextComponent vote = Component.text("You can")
            .color(NamedTextColor.GREEN)
            .append(Component.text(" Vote ", NamedTextColor.GOLD))
            .hoverEvent(Component.text("Click to visit Voting Guide!", NamedTextColor.GREEN))
            .clickEvent(ClickEvent.openUrl("https://www.adventurescraft.net/wiki/site/vote/"))
            .append(Component.text("for our Server, to receive awesome rewards every day!"));

    public VoteRewards(AdventuresCraft plugin, SoundManager soundManager, GUIHelper guiHelper, ConsoleCommand consoleCommand, MMOItemsGive mmoItemsGive, BetonPointsManager betonPointsManager) {
        this.plugin = plugin;
        this.soundManager = soundManager;
        this.guiHelper = guiHelper;
        this.consoleCommand = consoleCommand;
        this.mmoItemsGive = mmoItemsGive;
        this.betonPointsManager = betonPointsManager;
    }

    @CommandAlias("Vote|VoteRewards")
    public void voteRewards(Player player) {
        player.sendMessage(vote);

        ChestGui gui = new ChestGui(3, guiHelper.guiName("Vote"));
        gui.setOnGlobalClick(event -> event.setCancelled(true));

        OutlinePane background = new OutlinePane(0, 0, 9, 3, Pane.Priority.LOWEST);
        StaticPane display = new StaticPane(0, 0, 9, 3, Pane.Priority.LOW);


        background.addItem(new GuiItem(guiHelper.background(Material.ORANGE_STAINED_GLASS_PANE)));
        background.setRepeat(true);

        int i = 0;
        for (VoteRewardList item : VoteRewardList.values()) {
            final ItemStack itemStack = MMOItems.plugin.getItem(item.type, item.id);
            final ItemMeta itemMeta = itemStack.getItemMeta();

            if (itemStack != null) {
                List<Component> lore = itemStack.lore();
                if (lore == null) {
                    lore = new ArrayList<>();
                } else if (!lore.isEmpty()) {
                    lore.add(Component.empty());
                }
                lore.add(Component.text(ChatColor.WHITE + "Price: " + ChatColor.GOLD + item.getPrice() + ChatColor.GREEN + " Vote Coins"));
                lore.add(Component.text(" "));
                lore.add(Component.text(Prefix.PREFIX.getString() + ChatColor.YELLOW + "Click to Buy (" + ChatColor.GOLD + parsePlaceholder(player, "ac_Currency_VotingCoins") + " Available" + ChatColor.YELLOW + ")"));

                itemMeta.lore(lore);
                itemStack.setItemMeta(itemMeta);

                switch (i) {
                    case 0:
                        display.addItem(new GuiItem(itemStack.asQuantity(5), e -> player.performCommand("VoteClaim Lootbox3")), 1, 1);
                        break;
                    case 1:
                        display.addItem(new GuiItem(itemStack.asQuantity(5), e -> player.performCommand("VoteClaim Lootbox4")), 2, 1);
                        break;
                    case 2:
                        display.addItem(new GuiItem(itemStack.asQuantity(5), e -> player.performCommand("VoteClaim Lootbox5")), 3, 1);
                        break;
                    case 3:
                        display.addItem(new GuiItem(itemStack, e -> player.performCommand("VoteClaim PET_EGG3")), 5, 1);
                        break;
                    case 4:
                        display.addItem(new GuiItem(itemStack, e -> player.performCommand("VoteClaim PET_EGG4")), 6, 1);
                        break;
                    case 5:
                        display.addItem(new GuiItem(itemStack, e -> player.performCommand("VoteClaim PET_EGG5")), 7, 1);
                        break;
                }
                i++;
            }
        }

        display.addItem(new GuiItem(voting(player), e -> player.performCommand("vote")), 4, 0);

        display.addItem(new GuiItem(guiHelper.backButton(), e -> player.performCommand("main")), 4, 2);

        gui.addPane(background);
        gui.addPane(display);
        gui.show(player);
    }


    private ItemStack voting(Player player) {
        final ItemStack voting = new ItemStack(Material.OAK_SIGN);
        final ItemMeta votingItemMeta = voting.getItemMeta();

        votingItemMeta.displayName(Component.text(ChatColor.GREEN + "Voting"));

        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GREEN + "Vote " +  ChatColor.GRAY + "every " + ChatColor.GREEN + "24 hours " +  ChatColor.GRAY + "to receive");
        lore.add(ChatColor.GRAY + "a " + ChatColor.GREEN + "Vote Coin" +  ChatColor.GRAY + ", which can be redeemed");
        lore.add(ChatColor.GRAY + "for special rewards from this Shop!");
        lore.add("");
        lore.add(ChatColor.GOLD + "Voting Site #1: " + ChatColor.GREEN + parsePlaceholder(player, "custom_vote1"));
        lore.add(ChatColor.GOLD + "Voting Site #2: " + ChatColor.GREEN + parsePlaceholder(player, "custom_vote2"));
        lore.add(ChatColor.GOLD + "Voting Site #3: " + ChatColor.GREEN + parsePlaceholder(player, "custom_vote3"));
        lore.add(ChatColor.GOLD + "Voting Site #4: " + ChatColor.GREEN + parsePlaceholder(player, "custom_vote4"));
        lore.add("");
        lore.add(Prefix.PREFIX.getString() + ChatColor.YELLOW + "Click to Vote");

        voting.setItemMeta(votingItemMeta);
        voting.setLore(lore);

        return voting;
    }

    @CommandAlias("VoteClaim")
    private void voteClaimCommand(Player player, String rewardName) {
        final Integer voteCoins = Integer.valueOf(PlaceholderAPI.setPlaceholders(player, "%ac_Currency_VotingCoins%"));
        for (VoteRewardList reward : VoteRewardList.values()) {
            if (rewardName.equalsIgnoreCase(reward.getId())) {
                if (voteCoins >= reward.getPrice()) {
                    mmoItemsGive.giveMMOItem(player, reward.getType(), reward.getId(), reward.getAmount());
                    betonPointsManager.takePoint(player, "items.Vote", reward.getPrice());
                    soundManager.soundYes(player, 2);
                    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, () -> {
                        player.sendMessage(ChatColor.GREEN + "Your purchase was successful and you now have " + ChatColor.GOLD + PlaceholderAPI.setPlaceholders(player, "%ac_Currency_VotingCoins%") + ChatColor.GREEN + " Vote Coins remaining!");
                    }, 5L);
                } else {
                    player.sendMessage(ChatColor.RED + "You only have " + ChatColor.GOLD + voteCoins + ChatColor.RED + "/" + ChatColor.GOLD + reward.getPrice() + ChatColor.RED + " Vote Coins!");
                    soundManager.soundNo(player, 1);
                }
            }
        }
    }

    private String parsePlaceholder(Player player, String string) {
        return PlaceholderAPI.setPlaceholders(player, "%" + string + "%");
    }

}

