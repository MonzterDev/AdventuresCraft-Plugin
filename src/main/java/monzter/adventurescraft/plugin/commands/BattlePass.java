package monzter.adventurescraft.plugin.commands;

import monzter.adventurescraft.plugin.AdventuresCraft;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BattlePass implements CommandExecutor {
    private final AdventuresCraft plugin;

    public BattlePass(AdventuresCraft plugin) {
            this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 1){
            sender.sendMessage(ChatColor.GREEN + "This is the BattlePass! "
                    + ChatColor.GOLD + "Monzter" + ChatColor.GREEN + "!");
            return true;
        }
        if (args[0].equalsIgnoreCase("reload")){
            if (sender.isOp() || sender.hasPermission(plugin.getConfig().getString("Admin-Permission", "CAPTCHA.ADMIN"))){
                sender.sendMessage(plugin.TITLE + ChatColor.GREEN + "The plugin has been reloaded!");
                plugin.reloadConfig();
//                try {
//                    plugin.loadLang();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
                return true;
            }
        }
//        if (args[0].equalsIgnoreCase("reset")){
//            if (sender.isOp() || sender.hasPermission(plugin.getConfig().getString("Admin-Permission", "CAPTCHA.ADMIN"))){
//                Player player = (Player) sender;
//                if (args.length >= 2){
//                    if (Bukkit.getPlayer(args[1]) != null){
//                        Player target = Bukkit.getPlayer(args[1]);
//                        plugin.getPermissions().playerRemove(target, plugin.getConfig().getString("Given-Permission", "CAPTCHA.VERIFIED"));
//                        target.sendMessage(plugin.TITLE + Language.RESET.toString().replace("%player%", target.getName()));
//                    } else{
//                        sender.sendMessage(plugin.TITLE + Language.INVALID_PLAYER);
//                    }
//                } else {
//                    plugin.getPermissions().playerRemove(player, plugin.getConfig().getString("Given-Permission", "CAPTCHA.VERIFIED"));
//                    sender.sendMessage(plugin.TITLE + Language.RESET.toString().replace("%player%", sender.getName()));
//                }
//                return true;
//            }
//        }
//
        return true;
    }
}

