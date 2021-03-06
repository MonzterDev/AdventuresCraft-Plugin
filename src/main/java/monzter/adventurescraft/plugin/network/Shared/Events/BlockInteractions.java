package monzter.adventurescraft.plugin.network.Shared.Events;

import monzter.adventurescraft.plugin.AdventuresCraft;
import monzter.adventurescraft.plugin.utilities.general.ConsoleCommand;
import monzter.adventurescraft.plugin.utilities.general.ShopOpener;
import monzter.adventurescraft.plugin.utilities.general.SoundManager;
import monzter.adventurescraft.plugin.utilities.luckperms.PermissionLP;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

public class BlockInteractions implements Listener {
    private final AdventuresCraft plugin;
    private final SoundManager soundManager;
    private final PermissionLP permissionLP;
    private final ConsoleCommand consoleCommand;
    private final ShopOpener shopOpener;


    private final List<Material> blocks = Arrays.asList(Material.ENCHANTING_TABLE, Material.CAULDRON, Material.ANVIL, Material.CHEST,
            Material.CHEST_MINECART, Material.ENDER_CHEST, Material.TRAPPED_CHEST, Material.BEACON, Material.BEE_NEST,
            Material.SMITHING_TABLE, Material.BARREL, Material.BREWING_STAND, Material.COMMAND_BLOCK,
            Material.CARTOGRAPHY_TABLE, Material.SHULKER_BOX, Material.GRINDSTONE, Material.LECTERN, Material.ACACIA_TRAPDOOR, Material.BIRCH_TRAPDOOR,
            Material.CRIMSON_TRAPDOOR, Material.IRON_TRAPDOOR, Material.OAK_TRAPDOOR, Material.DARK_OAK_TRAPDOOR, Material.JUNGLE_TRAPDOOR, Material.SPRUCE_TRAPDOOR,
            Material.WARPED_TRAPDOOR);
    private final List<Material> homeBlocks = Arrays.asList(Material.ENCHANTING_TABLE, Material.CAULDRON, Material.ANVIL,
            Material.ENDER_CHEST, Material.BEACON, Material.SMITHING_TABLE, Material.BARREL, Material.BREWING_STAND, Material.COMMAND_BLOCK,
            Material.CARTOGRAPHY_TABLE, Material.SHULKER_BOX, Material.GRINDSTONE, Material.LECTERN);
    private final List<Material> tools = Arrays.asList(Material.WOODEN_AXE, Material.WOODEN_HOE, Material.WOODEN_PICKAXE, Material.WOODEN_SHOVEL,
            Material.STONE_AXE, Material.STONE_HOE, Material.STONE_PICKAXE, Material.STONE_SHOVEL,
            Material.IRON_AXE, Material.IRON_HOE, Material.IRON_PICKAXE, Material.IRON_SHOVEL,
            Material.GOLDEN_AXE, Material.GOLDEN_HOE, Material.GOLDEN_PICKAXE, Material.GOLDEN_SHOVEL,
            Material.DIAMOND_AXE, Material.DIAMOND_HOE, Material.DIAMOND_PICKAXE, Material.DIAMOND_SHOVEL,
            Material.NETHERITE_AXE, Material.NETHERITE_HOE, Material.NETHERITE_PICKAXE, Material.NETHERITE_SHOVEL);

    public BlockInteractions(AdventuresCraft plugin, SoundManager soundManager, PermissionLP permissionLP, ConsoleCommand consoleCommand, ShopOpener shopOpener) {
        this.plugin = plugin;
        this.soundManager = soundManager;
        this.permissionLP = permissionLP;
        this.consoleCommand = consoleCommand;
        this.shopOpener = shopOpener;
    }

    @EventHandler
    public void cancel(PlayerInteractEvent event) {
        switch (plugin.SERVER) {
            case "Prison":
            case "Adventure":
                if (event.getClickedBlock() != null)
                    if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK))
                        if (!event.getPlayer().isOp())
                            if (blocks.contains(event.getClickedBlock().getType()))
                                event.setCancelled(true);
                break;
            case "Home":
            case "Cell":
                if (event.getClickedBlock() != null)
                    if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK))
                        if (!event.getPlayer().isOp())
                            if (homeBlocks.contains(event.getClickedBlock().getType()))
                                event.setCancelled(true);
                break;
        }
    }


    @EventHandler
    public void enchantingTable(PlayerInteractEvent event) {
        switch (plugin.SERVER) {
            case "Prison":
            case "Cell":
                if (event.getClickedBlock() != null)
                    switch (event.getClickedBlock().getType()) {
                        case ENCHANTING_TABLE:
                            final Player player = event.getPlayer();
                            final ItemStack itemStack = event.getItem();
                            if (itemStack != null) {
                                if (tools.contains(itemStack.getType())) {
                                    player.performCommand("enchantmentShop");
                                    soundManager.playSound(player, Sound.BLOCK_ENCHANTMENT_TABLE_USE, 1, 1);
                                } else {
                                    player.sendMessage(ChatColor.RED + "You must be holding a tool to enchant!");
                                    soundManager.soundNo(player, 1);
                                }
                            } else {
                                player.sendMessage(ChatColor.RED + "You must be holding a tool to enchant!");
                                soundManager.soundNo(player, 1);
                            }
                            event.setCancelled(true);
                            break;
                        case SMOKER:
                            consoleCommand.consoleCommand("bs open Pets " + event.getPlayer().getName());
                            event.setCancelled(true);
                            break;
                    }
                break;
            case "Adventure":
            case "Home":
                if (event.getClickedBlock() != null)
                    if (event.getClickedBlock().getType().equals(Material.ENCHANTING_TABLE) || event.getClickedBlock().getType().equals(Material.END_PORTAL_FRAME)) {
                        final Player player = event.getPlayer();
                        shopOpener.shopOpener(player, "EnchanterShop");
                        soundManager.playSound(player, Sound.BLOCK_ENCHANTMENT_TABLE_USE, 1, 1);
                        event.setCancelled(true);
                    }
                break;
        }
    }

    @EventHandler
    public void enderChest(PlayerInteractEvent event) {
        switch (plugin.SERVER) {
            case "Prison":
            case "Cell":
            case "Adventure":
            case "Home":
                if (event.getClickedBlock() != null && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)
                        && event.getClickedBlock().getType().equals(Material.ENDER_CHEST)) {
                    final Player player = event.getPlayer();
                    if (!player.hasPermission("bank.open.command")) {
                        permissionLP.giveTempPermission(player, "bank.open.command", 2, "s");
                        player.performCommand("banks open");
                    }
                }
        }
    }

    @EventHandler
    public void spellforging(PlayerInteractEvent event) {
        switch (plugin.SERVER) {
            case "Adventure":
            case "Home":
                if (event.getClickedBlock() != null && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)
                        && event.getClickedBlock().getType().equals(Material.GRAY_SHULKER_BOX)) {
                    shopOpener.shopOpener(event.getPlayer(), "SpellforgingShop");
                }
        }
    }
}