package monzter.adventurescraft.plugin.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import monzter.adventurescraft.plugin.AdventuresCraft;
import monzter.adventurescraft.plugin.event.extras.StatsDisplay;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class AdminCommands implements CommandExecutor, @Nullable TabCompleter {
    private final AdventuresCraft plugin;
    private HashMap<UUID, Integer> codeAttempts = new HashMap<>();

    public AdminCommands(AdventuresCraft plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender != null && sender.isOp()) {
                Player player = ((Player) sender).getPlayer();
                switch (command.getName()) {
                    case "Stat":
                        if (args.length < 1) {
                            player.sendMessage(ChatColor.RED + "/Stat <Player> <Stat>");
                            return true;
                        } else {
                            Player targetPlayer = Bukkit.getPlayer(args[1]);
                            switch (args[0].toLowerCase()) {
                                case "maxweightm":
                                    String statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MaxWeightMultiplier%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "blockm":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_BlockMultiplier%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "sellm":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_SellMultiplier%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "luckm":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_LuckMultiplier%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "expm":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_EXPMultiplier%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "petexpm":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_Pet_EXPMultiplier%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "maxweight":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MaxWeight%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "weight":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_Weight%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "exp":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_EXPAmount%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "pets":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_PetAmount%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "maxpets":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MaxPetAmount%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "ac":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Currency_AdventureCoins%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "miningpass":
                                    statValue = PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MiningPassEXPAmount%");
                                    checkStat(player, targetPlayer, args[0], statValue);
                                    return true;
                                case "all":
                                    checkAllStats(player, targetPlayer);
                                    return true;
                            }
                        }
                    case "PointsAdd":
                        if (args.length < 1) {
                            player.sendMessage(ChatColor.RED + "/PointsPointsAdd <Amount> <Material>");
                            return true;
                        } else if (args.length > 1) {
                            player.sendMessage(ChatColor.YELLOW + "You added +" + args[0] + " to " + args[1] + ChatColor.GREEN + "!");
                            plugin.data.loadPlayer(player, args[1], Long.valueOf(args[0]));
                            plugin.data.savePlayer(player, args[1], Long.valueOf(args[0]));
                            return true;
                        }
                        return true;
                    case "PointsAmount":
                        if (args.length < 1) {
                            player.sendMessage(ChatColor.RED + "/PointsAmount <Material>");
                            return true;
                        } else if (args.length > 1) {
                            player.sendMessage(ChatColor.GREEN + "You have mined " + plugin.data.getPointAmount(player.getUniqueId(), args[0]) + " " + ChatColor.COLOR_CHAR + args[0] + ChatColor.GREEN + "!");
                            return true;
                        }
                        return false;
                    case "RestartTime":
                        String restartTime = PlaceholderAPI.setPlaceholders(player, "%ac_Restart_formatted%");
                        String restartTimeSeconds = PlaceholderAPI.setPlaceholders(player, "%ac_Restart%");
                        player.sendMessage(ChatColor.GREEN + "There is " + ChatColor.GOLD + restartTime + ChatColor.GREEN + " until restart!");
                        player.sendMessage(ChatColor.GOLD + restartTimeSeconds + ChatColor.GREEN + " seconds!");
                        return true;
                    case "Reward":
                        if (args.length < 1) {
                            player.sendMessage(ChatColor.RED + "/Reward <Stat> <Amount> <Player>");
                            return true;
                        } else if (args.length > 1) {
                            Player targetPlayer = Bukkit.getPlayer(args[2]);
                            if (targetPlayer != null) {
                                switch (args[0]) {
                                    case "petexperience":
                                    case "petexp":
                                        targetPlayer.sendMessage(ChatColor.GREEN + "You gained +" + ChatColor.GOLD + args[1] + ChatColor.GREEN + "x " + ChatColor.AQUA + "❉ Pet Experience" + ChatColor.GREEN + "!");
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + targetPlayer.getName() + " add items.PetExperience " + args[1]);
                                        return true;
                                    case "Experience":
                                    case "exp":
                                        targetPlayer.sendMessage(ChatColor.GREEN + "You gained +" + ChatColor.GOLD + args[1] + ChatColor.GREEN + "x " + ChatColor.GREEN + "۞ Experience" + ChatColor.GREEN + "!");
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + targetPlayer.getName() + " add items.Experience " + args[1]);
                                        return true;
                                    case "miningpass":
                                        targetPlayer.sendMessage(ChatColor.GREEN + "You gained +" + ChatColor.GOLD + args[1] + ChatColor.GREEN + "x " + ChatColor.DARK_PURPLE + "♦ Mining Pass Experience" + ChatColor.GREEN + "!");
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + targetPlayer.getName() + " add MiningPass.EXP " + args[1]);
                                        return true;
                                    case "ac":
                                    case "AdventureCoins":
                                        targetPlayer.sendMessage(ChatColor.GREEN + "You gained +" + ChatColor.GOLD + args[1] + ChatColor.GREEN + "x " + StatsDisplay.ADVENTURE_COINS.getName() + ChatColor.GREEN + "!");
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + targetPlayer.getName() + " add items.AdventureCoin " + args[1]);
                                        return true;
                                }
                            } else {
                                switch (args[0]) {
                                    case "petexperience":
                                    case "petexp":
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + args[2] + " add items.PetExperience " + args[1]);
                                        return true;
                                    case "Experience":
                                    case "exp":
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + args[2] + " add items.Experience " + args[1]);
                                        return true;
                                    case "miningpass":
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + args[2] + " add MiningPass.EXP " + args[1]);
                                        return true;
                                }
                            }
                            return true;
                        }
                        return true;
                }
            }
        } else if (sender instanceof ConsoleCommandSender) {
            if (sender != null && sender.isOp()) {
                switch (command.getName()) {
                    case "Reward":
                        if (args.length < 1) {
                            sender.sendMessage(ChatColor.RED + "/Reward <Stat> <Amount> <Player>");
                            return true;
                        } else if (args.length > 1) {
                            Player targetPlayer = Bukkit.getPlayer(args[2]);
                            if (targetPlayer != null) {
                                switch (args[0].toLowerCase()) {
                                    case "petexperience":
                                    case "petexp":
                                        targetPlayer.sendMessage(ChatColor.GREEN + "You gained +" + ChatColor.GOLD + args[1] + ChatColor.GREEN + "x " + ChatColor.AQUA + "❉ Pet Experience" + ChatColor.GREEN + "!");
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + targetPlayer.getName() + " add items.PetExperience " + args[1]);
                                        return true;
                                    case "experience":
                                    case "exp":
                                        targetPlayer.sendMessage(ChatColor.GREEN + "You gained +" + ChatColor.GOLD + args[1] + ChatColor.GREEN + "x " + ChatColor.GREEN + "۞ Experience" + ChatColor.GREEN + "!");
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + targetPlayer.getName() + " add items.Experience " + args[1]);
                                        return true;
                                    case "miningpass":
                                        targetPlayer.sendMessage(ChatColor.GREEN + "You gained +" + ChatColor.GOLD + args[1] + ChatColor.GREEN + "x " + ChatColor.DARK_PURPLE + "♦ Mining Pass Experience" + ChatColor.GREEN + "!");
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + targetPlayer.getName() + " add MiningPass.EXP " + args[1]);
                                        return true;
                                }
                            } else {
                                switch (args[0].toLowerCase()) {
                                    case "petexperience":
                                    case "petexp":
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + args[2] + " add items.PetExperience " + args[1]);
                                        return true;
                                    case "experience":
                                    case "exp":
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + args[2] + " add items.Experience " + args[1]);
                                        return true;
                                    case "miningpass":
                                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "q point " + args[2] + " add MiningPass.EXP " + args[1]);
                                        return true;
                                }
                            }
                            return true;
                        }
                        return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (sender.isOp()) {
            if (command.getName().toLowerCase().equals("stat")) {
                if (args.length == 1) {
                    List<String> arguments = new ArrayList<>(Arrays.asList("all", "petexp", "weight", "maxweight", "exp", "pets", "maxpets", "miningpass", "ac", "petexpm",
                            "maxweightm", "blockm", "sellm", "luckm", "expm"));
                    return arguments;
                }
            }
        }
        return null;
    }

    public void checkStat(Player player, Player targetPlayer, String statName, String statValue) {
        player.sendMessage(ChatColor.GREEN + "You checked " + ChatColor.GOLD + targetPlayer.getName()
                + ChatColor.DARK_GREEN + " " + statName + ChatColor.GREEN + " they have " + statValue);
    }

    public void checkAllStats(Player player, Player targetPlayer) {
        if (!targetPlayer.isOnline()) {
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.DARK_GREEN + "❂ Current Weight: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_Weight%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.BLUE + "❂ Max Weight: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MaxWeight%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.DARK_PURPLE + "❂ Max Weight Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MaxWeightMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.DARK_GREEN + "⛂ Sell Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_SellMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.YELLOW + "⚅ Luck Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_LuckMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.GREEN + "۞ Exp Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_EXPMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.AQUA + "❉ Pet EXP Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_Pet_EXPMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.GREEN + "۞ EXP: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_EXPAmount%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.LIGHT_PURPLE + "❉ Pet Amount: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_PetAmount%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.AQUA + "❉ Pet EXP: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_PetEXPAmount%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.RED + "◎ AdventureCoins: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Currency_AdventureCoins%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.DARK_RED + "5♦ MiningPass EXP: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MiningPassEXPAmount%"));
        } else {
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.GOLD + "⛏ Mining Speed: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MiningSpeed%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.DARK_GREEN + "❂ Current Weight: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_Weight%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.BLUE + "❂ Max Weight: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MaxWeight%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.DARK_PURPLE + "❂ Max Weight Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MaxWeightMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.DARK_RED + "回 Block Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_BlockMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.DARK_GREEN + "⛂ Sell Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_SellMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.YELLOW + "⚅ Luck Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_LuckMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.GREEN + "۞ Exp Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_EXPMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.AQUA + "❉ Pet EXP Multiplier: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_Pet_EXPMultiplier%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.GREEN + "۞ EXP: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_EXPAmount%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.LIGHT_PURPLE + "❉ Pet Amount: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_PetAmount%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.AQUA + "❉ Pet EXP: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_Pet_EXPAmount%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.RED + "◎ AdventureCoins: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Currency_AdventureCoins%"));
            player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + ChatColor.DARK_RED + "5♦ MiningPass EXP: " + PlaceholderAPI.setPlaceholders(targetPlayer, "%ac_Stat_MiningPassEXPAmount%"));

        }
    }
}

