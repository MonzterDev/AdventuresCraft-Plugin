package monzter.adventurescraft.plugin.network.AdventureGamemode.Shared.Commands.DropTables;

import me.lucko.helper.random.Weighted;
import monzter.adventurescraft.plugin.network.PrisonGamemode.shared.dropTables.ItemGenerator;
import monzter.adventurescraft.plugin.utilities.enums.CrateList;
import net.Indyuce.mmoitems.MMOItems;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.*;
import java.util.stream.Collectors;

public enum Crates implements Weighted, ItemGenerator {
    HELL2(CrateList.HELL, "SKIN", "RUSTED_SWORD3", 1, .20),
    HELL8(CrateList.HELL, "SKIN", "RUSTED_BATTLE_AXE3", 1, .20),
    HELL9(CrateList.HELL, "SKIN", "MAGMA_BATTLE_AXE3", 1, .20),
    HELL11(CrateList.HELL, "SKIN", "MAGMA_STAFF3", 1, .20),
    HELL12(CrateList.HELL, "SKIN", "RUSTED_STAFF3", 1, .20),
    HELL13(CrateList.HELL, "SKIN", "RUSTED_STAFF3_2", 1, .20),
    HELL1(CrateList.HELL, "SKIN", "HELL_BRINGER_SWORD4", 1, .10),
    HELL3(CrateList.HELL, "SKIN", "MAGMA_BLADE4", 1, .10),
    HELL6(CrateList.HELL, "SKIN", "HELL_BRINGER_BATTLE_AXE4", 1, .10),
    HELL7(CrateList.HELL, "SKIN", "HELL_BRINGER_BATTLE_AXE4_2", 1, .10),
    HELL10(CrateList.HELL, "SKIN", "SOUL_CONSUMING_BATTLE_AXE4", 1, .10),
    HELL14(CrateList.HELL, "SKIN", "HELL_FLAME_STAFF4", 1, .10),
    HELL15(CrateList.HELL, "SKIN", "HELL_FLAME_STAFF4_2", 1, .10),
    HELL4(CrateList.HELL, "SKIN", "WORLD_SPLITTER_SWORD5", 1, .05),
    HELL5(CrateList.HELL, "SKIN", "WORLD_SPLITTER_SWORD5_2", 1, .05),
    HELL16(CrateList.HELL, "SKIN", "HELL_TELEKINESIS_STAFF5", 1, .05),
    HELL17(CrateList.HELL, "SKIN", "HELL_TELEKINESIS_STAFF5_2", 1, .05),

    UNDEAD2(CrateList.UNDEAD, "SKIN", "GREEN_UNDEAD_SWORD3", 1, .20),
    UNDEAD8(CrateList.UNDEAD, "SKIN", "BLUE_UNDEAD_SWORD3", 1, .20),
    UNDEAD9(CrateList.UNDEAD, "SKIN", "BROWN_UNDEAD_SWORD3", 1, .20),
    UNDEAD11(CrateList.UNDEAD, "SKIN", "YELLOW_UNDEAD_SWORD3", 1, .20),
    UNDEAD12(CrateList.UNDEAD, "SKIN", "RED_UNDEAD_SWORD3", 1, .20),
    UNDEAD13(CrateList.UNDEAD, "SKIN", "SHORT_GREEN_UNDEAD_SWORD3", 1, .20),
    UNDEAD1(CrateList.UNDEAD, "SKIN", "SHORT_BLUE_UNDEAD_SWORD3", 1, .20),
    UNDEAD3(CrateList.UNDEAD, "SKIN", "SHORT_BROWN_UNDEAD_SWORD3", 1, .20),
    UNDEAD6(CrateList.UNDEAD, "SKIN", "SHORT_YELLOW_UNDEAD_SWORD3", 1, .20),
    UNDEAD7(CrateList.UNDEAD, "SKIN", "SHORT_PURPLE_UNDEAD_SWORD3", 1, .20),
    UNDEAD10(CrateList.UNDEAD, "SKIN", "SHORT_RED_UNDEAD_SWORD3", 1, .20),
    UNDEAD19(CrateList.UNDEAD, "SKIN", "GRAVE_DIGGER_BATTLE_AXE3", 1, .20),
    UNDEAD20(CrateList.UNDEAD, "SKIN", "DEATHLY_BATTLE_AXE3", 1, .20),
    UNDEAD5(CrateList.UNDEAD, "SKIN", "UNDEAD_BRINGER_STAFF3", 1, .20),
    UNDEAD14(CrateList.UNDEAD, "SKIN", "UNDEAD_SOUL_SPLITTER_SWORD4", 1, .10),
    UNDEAD15(CrateList.UNDEAD, "SKIN", "UNDEAD_SWORD_OF_DARKNESS4", 1, .10),
    UNDEAD4(CrateList.UNDEAD, "SKIN", "UNDEAD_SERPENT_STAFF4", 1, .10),
    UNDEAD16(CrateList.UNDEAD, "SKIN", "UNDEAD_SPRINKLER_STAFF4", 1, .10),
    UNDEAD18(CrateList.UNDEAD, "SKIN", "UNDEAD_BATTLE_AXE4", 1, .10),
    UNDEAD17(CrateList.UNDEAD, "SKIN", "UNDEAD_WATCHER_STAFF5", 1, .10),
    UNDEAD21(CrateList.UNDEAD, "SKIN", "HOLY_RISER_BLADE5", 1, .05),
    UNDEAD22(CrateList.UNDEAD, "SKIN", "HEAVENS_GATES_BATTLE_AXE5", 1, .05),
    UNDEAD23(CrateList.UNDEAD, "SKIN", "UNDEAD_SCYTHE5", 1, .05),

    FARMINGBoostersITEM1(CrateList.PROFESSION, "BOOSTER", "FARMING_BOOSTER1", 1, .25),
    MININGBoostersITEM1(CrateList.PROFESSION, "BOOSTER", "MINING_BOOSTER1", 1, .25),
    FORAGINGBoostersITEM1(CrateList.PROFESSION, "BOOSTER", "FORAGING_BOOSTER1", 1, .25),
    SLAYERBoostersITEM1(CrateList.PROFESSION, "BOOSTER", "SLAYER_BOOSTER1", 1, .25),
    ENCHANTINGBoostersITEM1(CrateList.PROFESSION, "BOOSTER", "ENCHANTING_BOOSTER1", 1, .25),
    SPELLFORGINGBoostersITEM1(CrateList.PROFESSION, "BOOSTER", "SPELLFORGING_BOOSTER1", 1, .25),
    COOKINGBoostersITEM1(CrateList.PROFESSION, "BOOSTER", "COOKING_BOOSTER1", 1, .25),
    FARMINGBoostersITEM2(CrateList.PROFESSION, "BOOSTER", "FARMING_BOOSTER2", 1, .20),
    MININGBoostersITEM2(CrateList.PROFESSION, "BOOSTER", "MINING_BOOSTER2", 1, .20),
    FORAGINGBoostersITEM2(CrateList.PROFESSION, "BOOSTER", "FORAGING_BOOSTER2", 1, .20),
    SLAYERBoostersITEM2(CrateList.PROFESSION, "BOOSTER", "SLAYER_BOOSTER2", 1, .20),
    ENCHANTINGBoostersITEM2(CrateList.PROFESSION, "BOOSTER", "ENCHANTING_BOOSTER2", 1, .20),
    SPELLFORGINGBoostersITEM2(CrateList.PROFESSION, "BOOSTER", "SPELLFORGING_BOOSTER2", 1, .20),
    COOKINGBoostersITEM2(CrateList.PROFESSION, "BOOSTER", "COOKING_BOOSTER2", 1, .20),
    FARMINGBoostersITEM3(CrateList.PROFESSION, "BOOSTER", "FARMING_BOOSTER3", 1, .15),
    MININGBoostersITEM3(CrateList.PROFESSION, "BOOSTER", "MINING_BOOSTER3", 1, .15),
    FORAGINGBoostersITEM3(CrateList.PROFESSION, "BOOSTER", "FORAGING_BOOSTER3", 1, .15),
    SLAYERBoostersITEM3(CrateList.PROFESSION, "BOOSTER", "SLAYER_BOOSTER3", 1, .15),
    ENCHANTINGBoostersITEM3(CrateList.PROFESSION, "BOOSTER", "ENCHANTING_BOOSTER3", 1, .15),
    SPELLFORGINGBoostersITEM3(CrateList.PROFESSION, "BOOSTER", "SPELLFORGING_BOOSTER3", 1, .15),
    COOKINGBoostersITEM3(CrateList.PROFESSION, "BOOSTER", "COOKING_BOOSTER3", 1, .15),
    FARMINGBoostersITEM4(CrateList.PROFESSION, "BOOSTER", "FARMING_BOOSTER4", 1, .10),
    MININGBoostersITEM4(CrateList.PROFESSION, "BOOSTER", "MINING_BOOSTER4", 1, .10),
    FORAGINGBoostersITEM4(CrateList.PROFESSION, "BOOSTER", "FORAGING_BOOSTER4", 1, .10),
    SLAYERBoostersITEM4(CrateList.PROFESSION, "BOOSTER", "SLAYER_BOOSTER4", 1, .10),
    ENCHANTINGBoostersITEM4(CrateList.PROFESSION, "BOOSTER", "ENCHANTING_BOOSTER4", 1, .10),
    SPELLFORGINGBoostersITEM4(CrateList.PROFESSION, "BOOSTER", "SPELLFORGING_BOOSTER4", 1, .10),
    COOKINGBoostersITEM4(CrateList.PROFESSION, "BOOSTER", "COOKING_BOOSTER4", 1, .10),
    FARMINGBoostersITEM5(CrateList.PROFESSION, "BOOSTER", "FARMING_BOOSTER5", 1, .05),
    MININGBoostersITEM5(CrateList.PROFESSION, "BOOSTER", "MINING_BOOSTER5", 1, .05),
    FORAGINGBoostersITEM5(CrateList.PROFESSION, "BOOSTER", "FORAGING_BOOSTER5", 1, .05),
    SLAYERBoostersITEM5(CrateList.PROFESSION, "BOOSTER", "SLAYER_BOOSTER5", 1, .05),
    ENCHANTINGBoostersITEM5(CrateList.PROFESSION, "BOOSTER", "ENCHANTING_BOOSTER5", 1, .05),
    SPELLFORGINGBoostersITEM5(CrateList.PROFESSION, "BOOSTER", "SPELLFORGING_BOOSTER5", 1, .05),
    COOKINGBoostersITEM5(CrateList.PROFESSION, "BOOSTER", "COOKING_BOOSTER5", 1, .05),

    MAGICAL2(CrateList.MAGICAL, "SPELL", "RESOLVE2", 4, .20),
    MAGICAL9(CrateList.MAGICAL, "SPELL", "TARGETED_FIREBALL2", 4, .20),
    MAGICAL12(CrateList.MAGICAL, "SPELL", "SPARKLE2", 4, .20),
    MAGICAL1(CrateList.MAGICAL, "SPELL", "BUNNY_MODE2", 4, .20),
    MAGICAL6(CrateList.MAGICAL, "SPELL", "BURNING_HANDS2", 4, .20),
    MAGICAL10(CrateList.MAGICAL, "SPELL", "FREEZING_CURSE2", 4, .20),
    MAGICAL20(CrateList.MAGICAL, "SPELL", "SHULKER_MISSILE2", 4, .20),
    MAGICAL14(CrateList.MAGICAL, "SPELL", "ARCANE_HAIL2", 4, .20),
    MAGICAL4(CrateList.MAGICAL, "SPELL", "FROZEN_AURA2", 4, .20),
    MAGICAL18(CrateList.MAGICAL, "SPELL", "MAGMA_FISSURE2", 4, .20),
    MAGICAL21(CrateList.MAGICAL, "SPELL", "ICE_CRYSTAL2", 4, .20),
    MAGICAL23(CrateList.MAGICAL, "SPELL", "CORRUPTED_FANGS2", 4, .20),
    MAGICAL25(CrateList.MAGICAL, "SPELL", "BLACK_HOLE2", 4, .20),
    MAGICAL27(CrateList.MAGICAL, "SPELL", "BOUNCY_FIREBALL2", 4, .20),
    MAGICAL29(CrateList.MAGICAL, "SPELL", "CURSED_BEAM2", 4, .20),
    MAGICAL31(CrateList.MAGICAL, "SPELL", "LIFE_ENDER2", 4, .20),
    MAGICAL33(CrateList.MAGICAL, "SPELL", "CORRUPT2", 4, .20),
    MAGICAL35(CrateList.MAGICAL, "SPELL", "ARCANE_RIFT2", 4, .20),
    MAGICAL37(CrateList.MAGICAL, "SPELL", "CONTAMINATION_RITUAL2", 4, .20),
    MAGICAL8(CrateList.MAGICAL, "SPELL", "RESOLVE3", 4, .10),
    MAGICAL11(CrateList.MAGICAL, "SPELL", "TARGETED_FIREBALL3", 4, .10),
    MAGICAL13(CrateList.MAGICAL, "SPELL", "SPARKLE3", 4, .10),
    MAGICAL3(CrateList.MAGICAL, "SPELL", "BUNNY_MODE3", 4, .10),
    MAGICAL7(CrateList.MAGICAL, "SPELL", "BURNING_HANDS3", 4, .10),
    MAGICAL19(CrateList.MAGICAL, "SPELL", "FREEZING_CURSE3", 4, .10),
    MAGICAL5(CrateList.MAGICAL, "SPELL", "SHULKER_MISSILE3", 4, .10),
    MAGICAL15(CrateList.MAGICAL, "SPELL", "ARCANE_HAIL3", 4, .10),
    MAGICAL16(CrateList.MAGICAL, "SPELL", "FROZEN_AURA3", 4, .10),
    MAGICAL17(CrateList.MAGICAL, "SPELL", "MAGMA_FISSURE3", 4, .10),
    MAGICAL22(CrateList.MAGICAL, "SPELL", "ICE_CRYSTAL3", 4, .10),
    MAGICAL24(CrateList.MAGICAL, "SPELL", "CORRUPTED_FANGS3", 4, .10),
    MAGICAL26(CrateList.MAGICAL, "SPELL", "BLACK_HOLE3", 4, .10),
    MAGICAL28(CrateList.MAGICAL, "SPELL", "BOUNCY_FIREBALL3", 4, .10),
    MAGICAL30(CrateList.MAGICAL, "SPELL", "CURSED_BEAM3", 4, .10),
    MAGICAL32(CrateList.MAGICAL, "SPELL", "LIFE_ENDER3", 4, .10),
    MAGICAL34(CrateList.MAGICAL, "SPELL", "CORRUPT3", 4, .10),
    MAGICAL36(CrateList.MAGICAL, "SPELL", "ARCANE_RIFT3", 4, .10),
    MAGICAL38(CrateList.MAGICAL, "SPELL", "CONTAMINATION_RITUAL3", 4, .10),

    BORG20(CrateList.BORG, "STEW", "MINERS_SNACK", 1, .30),
    BORG14(CrateList.BORG, "STEW", "SWIFT_STEW3", 1, .30),
    BORG4(CrateList.BORG, "GEM_STONE", "HEALTH_GEM", 1, .30),
    BORG21(CrateList.BORG, "MATERIAL", "ENCHANTED_OAK_LOG", 8, .20),
    BORG23(CrateList.BORG, "MATERIAL", "ENCHANTED_BIRCH_LOG", 8, .20),
    BORG25(CrateList.BORG, "MATERIAL", "ENCHANTED_DARK_OAK_LOG", 8, .20),
    BORG27(CrateList.BORG, "MATERIAL", "ENCHANTED_JUNGLE_LOG", 8, .20),
    BORG29(CrateList.BORG, "MATERIAL", "ENCHANTED_ACACIA_LOG", 8, .20),
    BORG31(CrateList.BORG, "MATERIAL", "ENCHANTED_SPRUCE_LOG", 8, .20),
    BORG37(CrateList.BORG, "BOOSTER", "MINING_BOOSTER1", 1, .20),
    BORG33(CrateList.BORG, "SPELL", "CONTAMINATION_RITUAL2", 8, .15),
    BORG35(CrateList.BORG, "SPELL", "CORRUPTED_FANGS2", 8, .15),
    BORG2(CrateList.BORG, "ARMOR", "HEAVY_HELMET", 1, .15),
    BORG9(CrateList.BORG, "ARMOR", "HEAVY_CHESTPLATE", 1, .15),
    BORG12(CrateList.BORG, "ARMOR", "HEAVY_LEGGINGS", 1, .15),
    BORG1(CrateList.BORG, "ARMOR", "HEAVY_BOOTS", 1, .15),
    BORG6(CrateList.BORG, "AXE", "HEAVY_AXE", 1, .15),
    BORG10(CrateList.BORG, "BOW", "HEAVY_BOW", 1, .15),
    BORG18(CrateList.BORG, "CONSUMABLE", "BANK_TOKEN", 1, .075),
    BORG8(CrateList.BORG, "MOUNT", "BORG", 1, .05),

    ENCHANTED_BOX(CrateList.ENCHANTED_BOX, "ENCHANTMENT", "ENCHANTING_STONE", 1, .30),
    ENCHANTED_BOX2(CrateList.ENCHANTED_BOX, "ENCHANTMENT", "ENCHANTING_STONE2", 1, .25),
    ENCHANTED_BOX3(CrateList.ENCHANTED_BOX, "ENCHANTMENT", "ENCHANTING_STONE3", 1, .15),
    ENCHANTED_BOX4(CrateList.ENCHANTED_BOX, "ENCHANTMENT", "ENCHANTING_STONE4", 1, .10),
    ENCHANTED_BOX5(CrateList.ENCHANTED_BOX, "ENCHANTMENT", "ENCHANTING_STONE5", 1, .05),

    ENCHANTED_BOX2_1(CrateList.ENCHANTED_BOX2, "ENCHANTMENT", "ENCHANTING_STONE2", 1, .25),
    ENCHANTED_BOX2_2(CrateList.ENCHANTED_BOX2, "ENCHANTMENT", "ENCHANTING_STONE3", 1, .15),
    ENCHANTED_BOX2_3(CrateList.ENCHANTED_BOX2, "ENCHANTMENT", "ENCHANTING_STONE4", 1, .10),
    ENCHANTED_BOX2_4(CrateList.ENCHANTED_BOX2, "ENCHANTMENT", "ENCHANTING_STONE5", 1, .05),

    ENCHANTED_BOX3_2(CrateList.ENCHANTED_BOX3, "ENCHANTMENT", "ENCHANTING_STONE3", 1, .15),
    ENCHANTED_BOX3_3(CrateList.ENCHANTED_BOX3, "ENCHANTMENT", "ENCHANTING_STONE4", 1, .10),
    ENCHANTED_BOX3_4(CrateList.ENCHANTED_BOX3, "ENCHANTMENT", "ENCHANTING_STONE5", 1, .05),

    REAPER1(CrateList.REAPER, "MATERIAL", "ENCHANTED_BONE", 3, .98),
    REAPER2(CrateList.REAPER, "QUEST", "REAPER_HEAD", 1, .15),
    REAPER3(CrateList.REAPER, "WHIP", "BONEWHIP2", 1, .10),
    REAPER4(CrateList.REAPER, "ARMOR", "GOLDEN_SKULL4", 1, .05),
    REAPER5(CrateList.REAPER, "COMPANION", "PET_REAPER", 1, .02),

    MORDEN1(CrateList.MORDEN, "CATALYST", "UNDEAD_CATALYST", 1, .05),
    MORDEN2(CrateList.MORDEN, "GEM_STONE", "UNDEAD_GEM3", 1, .05),
    MORDEN3(CrateList.MORDEN, "CATALYST", "DEAD_CATALYST", 1, .01),
    MORDEN4(CrateList.MORDEN, "QUEST", "MORDEN_HEAD", 1, .01),
    MORDEN5(CrateList.MORDEN, "BOW", "UNDEAD_BOW4", 1, .01),
    MORDEN6(CrateList.MORDEN, "GEM_STONE", "UNDEAD_GEM4", 1, .01),
    MORDEN7(CrateList.MORDEN, "ARMOR", "MORDEN_HEAD4", 1, .005),
    MORDEN8(CrateList.MORDEN, "ARMOR", "MORDEN_FEET4", 1, .005),
    MORDEN9(CrateList.MORDEN, "HAMMER", "GRAVE_DIGGER", 1, .005),
    MORDEN10(CrateList.MORDEN, "ARMOR", "MORDEN_CHEST4", 1, .0025),
    MORDEN11(CrateList.MORDEN, "ARMOR", "MORDEN_LEGS4", 1, .0025),
    MORDEN12(CrateList.MORDEN, "SWORD", "BONE_SWORD2", 1, .0025),
    MORDEN13(CrateList.MORDEN, "COMPANION", "PET_BOSS", 1, .0025),

    VOID_DRACULA1(CrateList.VOID_DRACULA, "CONSUMABLE", "DRAC_HEART", 1, .025),
    VOID_DRACULA2(CrateList.VOID_DRACULA, "DAGGER", "STEAK", 1, .07),
    VOID_DRACULA3(CrateList.VOID_DRACULA, "DAGGER", "DRACULA_DAGGER", 1, .05),
    VOID_DRACULA4(CrateList.VOID_DRACULA, "QUEST", "DRACULA_HEAD", 1, .05),
    VOID_DRACULA5(CrateList.VOID_DRACULA, "DAGGER", "STEAK2", 1, .03),
    VOID_DRACULA6(CrateList.VOID_DRACULA, "DAGGER", "DRACULA_DAGGER2", 1, .02),
    VOID_DRACULA7(CrateList.VOID_DRACULA, "ACCESSORY", "DRACS_FANG3", 1, .01),
    VOID_DRACULA8(CrateList.VOID_DRACULA, "GEM_STONE", "VEIN_DRAIN", 1, .01),
    VOID_DRACULA9(CrateList.VOID_DRACULA, "TOOL", "DRACS_PICKAXE", 1, .009),

    DRYAD1(CrateList.DRYAD, "QUEST", "DRYAD_HEAD", 1, .05),
    DRYAD2(CrateList.DRYAD, "WAND", "DRYAD_WEAK_VINE", 1, .03),
    DRYAD3(CrateList.DRYAD, "CATALYST", "WOOD_CATALYST", 1, .03),
    DRYAD4(CrateList.DRYAD, "AXE", "CARVING_AXE", 1, .02),
    DRYAD5(CrateList.DRYAD, "ACCESSORY", "DRYAD_CHARM4", 1, .02),
    DRYAD6(CrateList.DRYAD, "QUEST", "DRYAD_BARK", 1, .009),

    GOBLIN_CHIEF1(CrateList.GOBLIN_CHIEF, "HAMMER", "GOBLIN_HAMMER", 1, .05),
    GOBLIN_CHIEF2(CrateList.GOBLIN_CHIEF, "CONSUMABLE", "CHIEF_HEAD", 1, .05),
    GOBLIN_CHIEF3(CrateList.GOBLIN_CHIEF, "QUEST", "CHIEF_HEAD", 1, .05),
    GOBLIN_CHIEF4(CrateList.GOBLIN_CHIEF, "HAMMER", "CHIEF_HAMMER", 1, .02),
//    execute console command "/mm items give %player% CHIEF_JUKE_ITEM"

    VOID_WITHER1(CrateList.VOID_WITHER, "QUEST", "WITHER_HEAD", 1, .05),
    VOID_WITHER2(CrateList.VOID_WITHER, "CONSUMABLE", "WITHER_HEAD", 1, .05),
    VOID_WITHER3(CrateList.VOID_WITHER, "ARMOR", "CURSED_BOOTS4", 1, .01),
    VOID_WITHER4(CrateList.VOID_WITHER, "ARMOR", "CURSED_HELMET4", 1, .0095),
    VOID_WITHER5(CrateList.VOID_WITHER, "ARMOR", "CURSED_LEGGINGS4", 1, .009),
    VOID_WITHER6(CrateList.VOID_WITHER, "ARMOR", "CURSED_CHESTPLATE4", 1, .0085),
    VOID_WITHER7(CrateList.VOID_WITHER, "ARMOR", "DEVIL_HEAD5", 1, .005),
    VOID_WITHER8(CrateList.VOID_WITHER, "ARMOR", "DEVIL_BOOTS5", 1, .005),
    VOID_WITHER9(CrateList.VOID_WITHER, "ARMOR", "DEVIL_CHEST5", 1, .001),
    VOID_WITHER10(CrateList.VOID_WITHER, "ARMOR", "DEVIL_LEGS5", 1, .001),

    VOID_MAGMA1(CrateList.VOID_MAGMA, "CONSUMABLE", "VOIDMAGMA_HEAD", 1, .05),
    VOID_MAGMA2(CrateList.VOID_MAGMA, "QUEST", "VOIDMAGMA_HEAD", 1, .05),
    VOID_MAGMA3(CrateList.VOID_MAGMA, "SPELL", "MAGMA_FISSURE2", 1, .02),
    VOID_MAGMA4(CrateList.VOID_MAGMA, "SPELL", "MAGMA_FISSURE3", 1, .001),

    GHASTLY1(CrateList.GHASTLY, "QUEST", "GHASTLY_TEAR", 1, 1),
    GHASTLY2(CrateList.GHASTLY, "CONSUMABLE", "GHASTLY_HEAD", 1, .05),
    GHASTLY3(CrateList.GHASTLY, "QUEST", "GHASTLY_HEAD", 1, .05),
    GHASTLY4(CrateList.GHASTLY, "ARMOR", "DEVIL_HEAD5", 1, .0075),
    GHASTLY5(CrateList.GHASTLY, "ARMOR", "DEVIL_BOOTS5", 1, .0075),
    GHASTLY6(CrateList.GHASTLY, "ARMOR", "DEVIL_CHEST5", 1, .005),
    GHASTLY7(CrateList.GHASTLY, "ARMOR", "DEVIL_LEGS5", 1, .005),

    BULBLIN1(CrateList.BULBLIN, "MATERIAL", "ENCHANTED_ENDERPEARL", 1, .5),
    BULBLIN2(CrateList.BULBLIN, "CONSUMABLE", "BULBLIN_HEAD", 1, .05),
    BULBLIN3(CrateList.BULBLIN, "QUEST", "BULBLIN_HEAD", 1, .05),
    BULBLIN4(CrateList.BULBLIN, "MATERIAL", "BULBLIN_ARROW", 1, .04),
    BULBLIN5(CrateList.BULBLIN, "MATERIAL", "BULBLIN_SWORD_SHAVING", 1, .03),
    BULBLIN6(CrateList.BULBLIN, "BOW", "BULBLIN_BOW4", 1, .03),
    BULBLIN7(CrateList.BULBLIN, "SWORD", "BULBLIN_SWORD", 1, .02),
    BULBLIN8(CrateList.BULBLIN, "ARMOR", "BULBLIN_LEGS5", 1, .01),
    BULBLIN9(CrateList.BULBLIN, "ARMOR", "BULBLIN_CHEST5", 1, .0095),

    BULLBO1(CrateList.BULLBO, "MATERIAL", "ENCHANTED_ENDSTONE", 1, .5),
    BULLBO2(CrateList.BULLBO, "MATERIAL", "BULLBO_LEG", 1, .5),
    BULLBO3(CrateList.BULLBO, "CONSUMABLE", "BULLBO_HEAD", 1, .05),
    BULLBO4(CrateList.BULLBO, "QUEST", "BULLBO_HEAD", 1, .05),
    BULLBO5(CrateList.BULLBO, "ARMOR", "BULLBO_FEET5", 1, .04),
    BULLBO6(CrateList.BULLBO, "ARMOR", "BULLBO_HEAD5", 1, .03),
    BULLBO7(CrateList.BULLBO, "HAMMER", "BULLBO_ARM", 1, .02),
    BULLBO8(CrateList.BULLBO, "MOUNT", "BULLBO", 1, .01),

    ENCHANTRESS1(CrateList.ENCHANTRESS, "MATERIAL", "ENCHANTRESS_JEWEL", 1, .25),
    ENCHANTRESS2(CrateList.ENCHANTRESS, "QUEST", "ENCHANTRESS_HEAD", 1, .05),
    ENCHANTRESS3(CrateList.ENCHANTRESS, "STAFF", "ENCHANTRESS_STAFF", 1, .01),
    ENCHANTRESS4(CrateList.ENCHANTRESS, "GEM_STONE", "ENCHANTRESS_GEM", 1, .01),
    ENCHANTRESS5(CrateList.ENCHANTRESS, "GEM_STONE", "ENDERMAN_MISSILE", 1, .01),
    ENCHANTRESS6(CrateList.ENCHANTRESS, "GEM_STONE", "ZOMBIE_MISSILE", 1, .01),
    ENCHANTRESS7(CrateList.ENCHANTRESS, "GEM_STONE", "SLIME_MISSILE", 1, .01),
    ENCHANTRESS8(CrateList.ENCHANTRESS, "GEM_STONE", "CREEPER_MISSILE", 1, .01),
    ENCHANTRESS9(CrateList.ENCHANTRESS, "ARMOR", "ENCHANTRESS_HEAD4", 1, .01),
    ENCHANTRESS10(CrateList.ENCHANTRESS, "ARMOR", "ENCHANTRESS_CHEST4", 1, .01),
    ENCHANTRESS11(CrateList.ENCHANTRESS, "ARMOR", "ENCHANTRESS_LEGS4", 1, .01),
    ENCHANTRESS12(CrateList.ENCHANTRESS, "ARMOR", "ENCHANTRESS_BOOTS4", 1, .01),

    ;

    private static final Map<CrateList, List<Crates>> RARITY_LISTS = new EnumMap<>(CrateList.class);

    public static List<Crates> getCrates(CrateList rarity) {
        return RARITY_LISTS.computeIfAbsent(rarity, key -> Arrays.stream(values())
                .filter(lootbox -> lootbox.getCrate() == key)
                .collect(Collectors.toList()));
    }

    private final CrateList crate;
    private final String type;
    private final String id;
    private final int amount;
    private final double weight;

    Crates(CrateList crate, String type, String id, int amount, double weight) {
        this.crate = crate;
        this.id = id;
        this.type = type;
        this.weight = weight;
        this.amount = amount;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public CrateList getCrate() {
        return crate;
    }

    @Override
    public ItemStack generateItem() {
        final ItemStack itemStack = MMOItems.plugin.getItem(type, id);
        System.out.println(id);

        if (itemStack != null) {
            List<Component> lore = itemStack.lore();
            if (lore == null) {
                lore = new ArrayList<>();
            } else if (!lore.isEmpty()) {
                lore.add(Component.empty());
            }
            lore.add(Component.text("CHANCE: " + weight * 100 + "%", NamedTextColor.GOLD, TextDecoration.BOLD));
            itemStack.lore(lore);
            return itemStack.asQuantity(amount);
        }
        return null;
    }

    @Override
    public ItemStack generateItem(Player player) {
        return null;
    }
}
