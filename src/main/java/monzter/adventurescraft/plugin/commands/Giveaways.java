package monzter.adventurescraft.plugin.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import me.clip.placeholderapi.PlaceholderAPI;
import monzter.adventurescraft.plugin.AdventuresCraft;
import monzter.adventurescraft.plugin.event.extras.DonationRewardList;
import monzter.adventurescraft.plugin.event.extras.StatsDisplay;
import monzter.adventurescraft.plugin.utilities.bukkit.SoundManager;
import monzter.adventurescraft.plugin.utilities.mmoitems.MMOItemsGive;
import monzter.adventurescraft.plugin.utilities.vault.Permission;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.scheduler.BukkitRunnable;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

@CommandAlias("Giveaway")
public class Giveaways extends BaseCommand {

    @Dependency
    private final AdventuresCraft plugin;
    private final MMOItemsGive mmoItemsGive;
    private final SoundManager soundManager;
    private final Permission permission;
    private HashMap<String, String> reward = new HashMap<>();
    private HashMap<String, Integer> usages = new HashMap<>();

    public Giveaways(AdventuresCraft plugin, MMOItemsGive mmoItemsGive, SoundManager soundManager, Permission permission) {
        this.plugin = plugin;
        this.mmoItemsGive = mmoItemsGive;
        this.soundManager = soundManager;
        this.permission = permission;
    }

    @Subcommand("Create")
    @CommandPermission("*")
    private void giveaway(Player player, String code, String rewardName, int usageAmount) {
        reward.put(code, rewardName);
        usages.put(code, usageAmount);
        player.sendMessage(Component.text(ChatColor.GREEN + "Your code: " + ChatColor.GOLD + code +
                ChatColor.GREEN + " has been created with " + ChatColor.YELLOW + usageAmount + ChatColor.GREEN + " usages, and " +
                ChatColor.RED + rewardName + ChatColor.GREEN + " reward!"));
    }

    @Subcommand("Redeem")
    private void giveaway(Player player, String code) {
        if (usages.containsKey(code)) {
            if (!player.hasMetadata(code) || !player.getMetadata(code).get(0).asString().equals("redeemed")) {
                if (usages.get(code) > 0) {
                    if ((usages.get(code) - 1 < 0)) {
                        usages.remove(code);
                        reward.remove(code);
                        giveReward(player, code, reward.get(code), 0);
                    } else {
                        usages.replace(code, usages.get(code) - 1);
                        giveReward(player, code, reward.get(code), usages.get(code));
                    }
                }
            } else {
                player.sendMessage(Component.text(ChatColor.RED + "You already redeemed this giveaway!"));
                soundManager.soundNo(player, 1);
            }
        } else {
            player.sendMessage(Component.text(ChatColor.RED + "The entered code " + ChatColor.WHITE + code + ChatColor.RED + " is invalid, used, or expired!"));
            soundManager.soundNo(player, 1);
        }
    }

    private void giveReward(Player player, String code, String reward, int usages) {
        player.sendMessage(Component.text(ChatColor.GREEN + "You've redeemed the code " + ChatColor.WHITE + code
                + ChatColor.GREEN + " and received an awesome reward!" + ChatColor.YELLOW + " Usages left: " + usages));
        soundManager.soundYes(player, 1);
        player.setMetadata(code, new FixedMetadataValue(plugin, "redeemed"));
        switch (reward){
            case "Lootbox":
                //        Reward method
        }
    }
}

