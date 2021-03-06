package monzter.adventurescraft.plugin.network.Shared.Events;

import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.util.Location;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.protection.regions.RegionQuery;
import monzter.adventurescraft.plugin.AdventuresCraft;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class MapBarrier implements Listener {
    private final AdventuresCraft plugin;

    public MapBarrier(AdventuresCraft plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void mapBarrier(PlayerMoveEvent event) {
        switch (plugin.SERVER) {
            case "Prison":
            case "Adventure":
            case "Lobby":
                Player player = event.getPlayer();
                Location location = BukkitAdapter.adapt(player.getLocation());
                RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
                RegionQuery query = container.createQuery();
                ApplicableRegionSet set = query.getApplicableRegions(location);
                if (set.getRegions().size() == 0) {
                    if (!player.isOp()) {
                        player.sendMessage(ChatColor.RED + "You cannot escape the map! If you believe this is an error, please report these coordinates: "
                                + ChatColor.YELLOW + location.getBlockX() + "," + location.getBlockY() + "," + location.getBlockZ() + ChatColor.RED + " to an Admin on Discord!");
                        player.performCommand("Spawn");
                        player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, .5f, 1f);
                    }
                }
                break;
        }
    }

    @EventHandler
    public void voidDamage(EntityDamageEvent event) {
        if (event.getCause() == EntityDamageEvent.DamageCause.VOID && event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if (player != null && player.isOnline())
                player.setHealth(0);
        }
    }
}