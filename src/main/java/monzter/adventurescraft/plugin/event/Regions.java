package monzter.adventurescraft.plugin.event;

import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.util.Location;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.flags.StateFlag;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.protection.regions.RegionQuery;
import me.clip.placeholderapi.PlaceholderAPI;
import monzter.adventurescraft.plugin.AdventuresCraft;
import monzter.adventurescraft.plugin.event.extras.WeightPrices;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Regions implements Listener {
    private final AdventuresCraft plugin;

    public Regions(AdventuresCraft plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void mapBarrier(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location location = BukkitAdapter.adapt(player.getLocation());
        RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
        RegionQuery query = container.createQuery();
        ApplicableRegionSet set = query.getApplicableRegions(location);
        for (ProtectedRegion region : set) {
            if (region.getId().isEmpty()){
                if (!player.isOp()){
                    player.sendMessage(ChatColor.RED + "You cannot escape the map! If you believe this is an error, please report these coordinates: "
                            + ChatColor.YELLOW + location.getBlockX() + "," + location.getBlockY() + "," + location.getBlockZ() + ChatColor.RED + " to an Admin on Discord!" );
                    player.performCommand("spawn");
                    player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, .5f, 1f);
                }
            }
        }
    }

}
