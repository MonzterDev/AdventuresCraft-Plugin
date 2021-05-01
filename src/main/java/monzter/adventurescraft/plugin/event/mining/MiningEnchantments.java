package monzter.adventurescraft.plugin.event.mining;

import monzter.adventurescraft.plugin.AdventuresCraft;
import monzter.adventurescraft.plugin.event.mining.BlockBreakMining;
import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class MiningEnchantments implements CommandExecutor {
    private final AdventuresCraft plugin;

    public MiningEnchantments(AdventuresCraft plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof ConsoleCommandSender) {
            if (sender != null) {
                Player targetPlayer = Bukkit.getPlayer(args[1]);
                switch (command.getName()) {
                    case "EnchantReward":
                        switch (args[0].toLowerCase()) {
                            case "experience":
                                BlockBreakMining.enchantmentExperience(targetPlayer);
                                return true;
                            case "petexperience":
                                BlockBreakMining.enchantmentPetExperience(targetPlayer);
                                return true;
                            case "luck":
                                BlockBreakMining.enchantmentLuck(targetPlayer);
                                return true;
                            case "treasurer":
                                BlockBreakMining.enchantmentTreasurer(targetPlayer);
                                return true;
                            case "randomizer":
                                BlockBreakMining.enchantmentRandomizer(targetPlayer);
                                return true;
                            case "midastouch":
                                BlockBreakMining.enchantmentMidasTouch(targetPlayer);
                                return true;
                        }
                }
            }
        }
        return false;
    }

}
