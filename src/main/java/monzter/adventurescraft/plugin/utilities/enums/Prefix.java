package monzter.adventurescraft.plugin.utilities.enums;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.ChatColor;

public enum Prefix {
    PREFIX(ChatColor.DARK_GRAY.toString() + ChatColor.BOLD + "» ",
            MiniMessage.get().parse("<dark_gray><b>» ")),
    TUT_PREFIX(ChatColor.GOLD.toString() + ChatColor.BOLD + "[" + ChatColor.GREEN + ChatColor.BOLD + "TUT" + ChatColor.GOLD + ChatColor.BOLD + "] ",
            MiniMessage.get().parse("<gold><b>[<green><b>TUT<gold><b>] "));

    private final String string;
    private final Component component;

    Prefix(String string, Component component) {
        this.string = string;
        this.component = component;
    }

    public String getString() {
        return string;
    }

    public Component getComponent() {
        return component;
    }
}
