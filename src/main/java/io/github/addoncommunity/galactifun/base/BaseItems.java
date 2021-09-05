package io.github.addoncommunity.galactifun.base;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.addoncommunity.galactifun.Galactifun;
import io.github.addoncommunity.galactifun.api.items.spacesuit.SpaceSuit;
import io.github.addoncommunity.galactifun.api.items.spacesuit.SpaceSuitStat;
import io.github.addoncommunity.galactifun.api.items.spacesuit.SpaceSuitUpgrade;
import io.github.addoncommunity.galactifun.base.items.AutomaticDoor;
import io.github.addoncommunity.galactifun.base.items.CircuitPress;
import io.github.addoncommunity.galactifun.base.items.DiamondAnvil;
import io.github.addoncommunity.galactifun.base.items.LaunchPadCore;
import io.github.addoncommunity.galactifun.base.items.LaunchPadFloor;
import io.github.addoncommunity.galactifun.base.items.OxygenFiller;
import io.github.addoncommunity.galactifun.base.items.SpaceSuitUpgrader;
import io.github.addoncommunity.galactifun.base.items.knowledge.Observatory;
import io.github.addoncommunity.galactifun.base.items.knowledge.PlanetaryAnalyzer;
import io.github.addoncommunity.galactifun.base.items.protection.CoolingUnit;
import io.github.addoncommunity.galactifun.base.items.protection.IonDisperser;
import io.github.addoncommunity.galactifun.base.items.protection.OxygenSealer;
import io.github.addoncommunity.galactifun.base.items.protection.SpaceHeater;
import io.github.addoncommunity.galactifun.core.CoreCategory;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

/**
 * Holds the base machines and setup
 */
@UtilityClass
public final class BaseItems {

    //<editor-fold desc="Space Suits, Oxygen, Upgrades" defaultstate="collapsed">
    public static final SlimefunItemStack OXYGEN_FILLER = new SlimefunItemStack(
            "OXYGEN_FILLER",
            new ItemStack(Material.QUARTZ_BLOCK),
            "&fOxygen Filler",
            "&7Fills space suits with oxygen",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(100),
            LoreBuilder.speed(1)
    );
    public static final SlimefunItemStack SPACE_SUIT_UPGRADER = new SlimefunItemStack(
            "SPACE_SUIT_UPGRADER",
            new ItemStack(Material.IRON_BLOCK),
            "&fSpace Suit Upgrader",
            "&7Adds upgrades to your space suit",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(200),
            LoreBuilder.speed(1)
    );
    public static final SlimefunItemStack HEAT_RESISTANCE_UPGRADE = new SlimefunItemStack(
            "HEAT_RESISTANCE_UPGRADE",
            Material.IRON_BLOCK,
            "&7Heat Resistance Upgrade",
            "&8Add to your space suit to increase heat resistance"
    );
    public static final SlimefunItemStack COLD_RESISTANCE_UPGRADE = new SlimefunItemStack(
            "COLD_RESISTANCE_UPGRADE",
            Material.IRON_BLOCK,
            "&7Cold Resistance Upgrade",
            "&8Add to your space suit to increase cold resistance"
    );
    public static final SlimefunItemStack RADIATION_RESISTANCE_UPGRADE = new SlimefunItemStack(
            "RADIATION_RESISTANCE_UPGRADE",
            Material.IRON_BLOCK,
            "&7Radiation Resistance Upgrade",
            "&8Add to your space suit to increase radiation resistance"
    );
    public static final SlimefunItemStack SPACE_SUIT_HELMET = new SlimefunItemStack(
            "SPACE_SUIT_HELMET",
            Material.IRON_HELMET,
            "&fSpace Suit Helmet",
            "&7A basic space suit helmet",
            ""
    );
    public static final SlimefunItemStack SPACE_SUIT_CHEST = new SlimefunItemStack(
            "SPACE_SUIT_CHEST",
            Material.IRON_CHESTPLATE,
            "&fSpace Suit Chest",
            "&7A basic space suit chest",
            "",
            SpaceSuit.oxygenLore(0, 3600)
    );
    public static final SlimefunItemStack SPACE_SUIT_PANTS = new SlimefunItemStack(
            "SPACE_SUIT_PANTS",
            Material.IRON_LEGGINGS,
            "&fSpace Suit Pants",
            "&7Basic pair of space suit pants",
            ""
    );
    public static final SlimefunItemStack SPACE_SUIT_BOOTS = new SlimefunItemStack(
            "SPACE_SUIT_BOOTS",
            Material.IRON_BOOTS,
            "&fSpace Suit Boots",
            "&7Basic pair of space suit boots",
            ""
    );
    //</editor-fold>

    //<editor-fold desc="Random Stuff" defaultstate="collapsed">
    public static final SlimefunItemStack LAUNCH_PAD_CORE = new SlimefunItemStack(
            "LAUNCH_PAD_CORE",
            Material.STONE,
            "&fLaunch Pad Core",
            "",
            "&7Surround with 8 &fLaunch Pad Floor&7s",
            "&7to use"
    );

    public static final SlimefunItemStack LAUNCH_PAD_FLOOR = new SlimefunItemStack(
            "LAUNCH_PAD_FLOOR",
            Material.STONE_SLAB,
            "&fLaunch Pad Floor",
            "",
            "&7Used in constructing the Launch Pad"
    );

    public static final SlimefunItemStack CIRCUIT_PRESS = new SlimefunItemStack(
            "CIRCUIT_PRESS",
            Material.PISTON,
            "&fCircuit Press",
            "",
            "&7Creates circuits",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(256)
    );
    public static final SlimefunItemStack ASSEMBLY_TABLE = new SlimefunItemStack(
            "ASSEMBLY_TABLE",
            Material.SMITHING_TABLE,
            "&fAssembly Table",
            "",
            "&7Used to construct many things",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.power(2048, "/Craft")
    );
    public static final SlimefunItemStack STARGATE_RING = new SlimefunItemStack(
            "STARGATE_RING",
            Material.QUARTZ_BLOCK,
            "&9Stargate Ring",
            "",
            "&7Used to construct a stargate"
    );
    public static final SlimefunItemStack STARGATE_CONTROLLER = new SlimefunItemStack(
            "STARGATE_CONTROLLER",
            Material.CHISELED_QUARTZ_BLOCK,
            "&9Stargate Controller",
            "",
            "&7Used to control a stargate"
    );
    public static final SlimefunItemStack OBSERVATORY = new SlimefunItemStack(
            "OBSERVATORY",
            Material.GLASS,
            "&fObservatory",
            "",
            "&7Allows you to discover basic info about",
            "&7a world remotely. Only works on worlds",
            "&7closer than 0.25 ly (2,365,200,000,000 km)"
    );
    public static final SlimefunItemStack PLANETARY_ANALYZER = new SlimefunItemStack(
            "PLANETARY_ANALYZER",
            Material.SEA_LANTERN,
            "&fPlanetary Analyzer",
            "",
            "&7Allows you to discover advanced info",
            "&7about the current planet"
    );
    public static final SlimefunItemStack DIAMOND_ANVIL = new SlimefunItemStack(
            "DIAMOND_ANVIL",
            Material.ANVIL,
            "&fDiamond Anvil",
            "",
            "&7Compresses material so hard",
            "&7it becomes something else entirely",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(1024),
            LoreBuilder.powerBuffer(2048)
    );
    //</editor-fold>
    //<editor-fold desc="Protecting Blocks" defaultstate="collapsed">
    public static final SlimefunItemStack COOLING_UNIT_1 = new SlimefunItemStack(
            "COOLING_UNIT_1",
            HeadTexture.COOLING_UNIT.getTexture(),
            "&bCooling Unit I",
            "",
            "&7Effect: Heat",
            "&7Protection: 2",
            "&7Range: 200 blocks",
            LoreBuilder.powerPerSecond(1024),
            LoreBuilder.powerBuffer(2048)
    );
    public static final SlimefunItemStack COOLING_UNIT_2 = new SlimefunItemStack(
            "COOLING_UNIT_2",
            HeadTexture.COOLING_UNIT.getTexture(),
            "&bCooling Unit II",
            "",
            "&7Effect: Heat",
            "&7Protection: 4",
            "&7Range: 300 blocks",
            LoreBuilder.powerPerSecond(2048),
            LoreBuilder.powerBuffer(4096)
    );
    public static final SlimefunItemStack COOLING_UNIT_3 = new SlimefunItemStack(
            "COOLING_UNIT_3",
            HeadTexture.COOLING_UNIT.getTexture(),
            "&bCooling Unit III",
            "",
            "&7Effect: Heat",
            "&7Protection: 6",
            "&7Range: 400 blocks",
            LoreBuilder.powerPerSecond(3072),
            LoreBuilder.powerBuffer(6144)
    );
    public static final SlimefunItemStack SPACE_HEATER_1 = new SlimefunItemStack(
            "SPACE_HEATER_1",
            Material.SHROOMLIGHT,
            "&6Space Heater I",
            "",
            "&7Effect: Cold",
            "&7Protection: 2",
            "&7Range: 200 blocks",
            LoreBuilder.powerPerSecond(512),
            LoreBuilder.powerBuffer(1024)
    );
    public static final SlimefunItemStack SPACE_HEATER_2 = new SlimefunItemStack(
            "SPACE_HEATER_2",
            Material.SHROOMLIGHT,
            "&6Space Heater II",
            "",
            "&7Effect: Cold",
            "&7Protection: 4",
            "&7Range: 300 blocks",
            LoreBuilder.powerPerSecond(1024),
            LoreBuilder.powerBuffer(2048)
    );
    public static final SlimefunItemStack SPACE_HEATER_3 = new SlimefunItemStack(
            "SPACE_HEATER_3",
            Material.SHROOMLIGHT,
            "&6Space Heater III",
            "",
            "&7Effect: Cold",
            "&7Protection: 6",
            "&7Range: 400 blocks",
            LoreBuilder.powerPerSecond(2048),
            LoreBuilder.powerBuffer(4096)
    );
    public static final SlimefunItemStack ION_DISPERSER_1 = new SlimefunItemStack(
            "ION_DISPERSER_1",
            Material.PRISMARINE,
            "&fIon Disperser I",
            "",
            "&7Effect: Radiation",
            "&7Protection: 2",
            "&7Range: 200 blocks",
            LoreBuilder.powerPerSecond(512),
            LoreBuilder.powerBuffer(1024)
    );
    public static final SlimefunItemStack ION_DISPERSER_2 = new SlimefunItemStack(
            "ION_DISPERSER_2",
            Material.PRISMARINE,
            "&fIon Disperser II",
            "",
            "&7Effect: Radiation",
            "&7Protection: 4",
            "&7Range: 300 blocks",
            LoreBuilder.powerPerSecond(1024),
            LoreBuilder.powerBuffer(2048)
    );
    public static final SlimefunItemStack OXYGEN_SEALER = new SlimefunItemStack(
            "OXYGEN_SEALER",
            Material.FURNACE,
            "&fOxygen Sealer",
            "",
            "&7Fills a sealed area with oxygen. Range 300 blocks"
    );
    public static final SlimefunItemStack LANDING_HATCH = new SlimefunItemStack(
            "LANDING_HATCH",
            Material.IRON_TRAPDOOR,
            "&fLanding Hatch",
            "",
            "&7Rockets ignore this block when",
            "&7landing; they'll land on the",
            "&7highest block below it. It is",
            "&7considered impassable by air",
            "&7so it can be used to seal spaces"
    );
    public static final SlimefunItemStack SUPER_FAN = new SlimefunItemStack(
            "SUPER_FAN",
            Material.WHITE_WOOL,
            "&7Super Fan",
            "",
            "&7Place this next to a block that needs",
            "7a sealed area to extend the range by 20%"
    );
    public static final SlimefunItemStack AUTOMATIC_DOOR = new SlimefunItemStack(
            "AUTOMATIC_DOOR",
            Material.OBSERVER,
            "&fAutomatic Door",
            "",
            "&7Automatically places/removes the blocks inside",
            "&7when you go close/away from it"
    );
    //</editor-fold>
    //<editor-fold desc="Rock It" defaultstate="collapsed">
    private static final int TIER_ONE_FUEL = 10;
    private static final int TIER_ONE_STORAGE = 9;
    public static final SlimefunItemStack TIER_ONE = new SlimefunItemStack(
            "ROCKET_TIER_ONE",
            GalactifunHead.ROCKET,
            "&4Rocket Tier 1",
            "",
            "&7Fuel Capacity: " + TIER_ONE_FUEL,
            "&7Cargo Capacity: " + TIER_ONE_STORAGE
    );
    private static final int TIER_TWO_FUEL = 100;
    private static final int TIER_TWO_STORAGE = 18;
    public static final SlimefunItemStack TIER_TWO = new SlimefunItemStack(
            "ROCKET_TIER_TWO",
            GalactifunHead.ROCKET,
            "&4Rocket Tier 2",
            "",
            "&7Fuel Capacity: " + TIER_TWO_FUEL,
            "&7Cargo Capacity: " + TIER_TWO_STORAGE
    );
    private static final int TIER_THREE_FUEL = 500;
    private static final int TIER_THREE_STORAGE = 36;
    public static final SlimefunItemStack TIER_THREE = new SlimefunItemStack(
            "ROCKET_TIER_THREE",
            GalactifunHead.ROCKET,
            "&4Rocket Tier 3",
            "",
            "&7Fuel Capacity: " + TIER_THREE_FUEL,
            "&7Cargo Capacity: " + TIER_THREE_STORAGE
    );
    //</editor-fold>

    public static void setup(Galactifun galactifun) {
        new OxygenFiller(CoreCategory.MACHINES, OXYGEN_FILLER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {

        }).setCapacity(200).setEnergyConsumption(100).setProcessingSpeed(1).register(galactifun);
        new SpaceSuitUpgrader(CoreCategory.MACHINES, SPACE_SUIT_UPGRADER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {

        }).setCapacity(400).setEnergyConsumption(200).setProcessingSpeed(1).register(galactifun);

        new SpaceSuitUpgrade(CoreCategory.EQUIPMENT, HEAT_RESISTANCE_UPGRADE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.COOLING_UNIT, SlimefunItems.COOLING_UNIT, SlimefunItems.COOLING_UNIT,
                SlimefunItems.COOLING_UNIT, new ItemStack(Material.IRON_BLOCK), SlimefunItems.COOLING_UNIT,
                SlimefunItems.COOLING_UNIT, SlimefunItems.COOLING_UNIT, SlimefunItems.COOLING_UNIT
        }, SpaceSuitStat.HEAT_RESISTANCE, 1).register(galactifun);
        new SpaceSuitUpgrade(CoreCategory.EQUIPMENT, COLD_RESISTANCE_UPGRADE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.HEATING_COIL, SlimefunItems.HEATING_COIL, SlimefunItems.HEATING_COIL,
                SlimefunItems.HEATING_COIL, new ItemStack(Material.IRON_BLOCK), SlimefunItems.HEATING_COIL,
                SlimefunItems.HEATING_COIL, SlimefunItems.HEATING_COIL, SlimefunItems.HEATING_COIL
        }, SpaceSuitStat.COLD_RESISTANCE, 1).register(galactifun);
        new SpaceSuitUpgrade(CoreCategory.EQUIPMENT, RADIATION_RESISTANCE_UPGRADE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT,
                SlimefunItems.LEAD_INGOT, new ItemStack(Material.IRON_BLOCK), SlimefunItems.LEAD_INGOT,
                SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT
        }, SpaceSuitStat.RADIATION_RESISTANCE, 1).register(galactifun);

        new SpaceSuit(CoreCategory.EQUIPMENT, SPACE_SUIT_HELMET, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {

        }, 1, 0).register(galactifun);
        new SpaceSuit(CoreCategory.EQUIPMENT, SPACE_SUIT_CHEST, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {

        }, 1, 3600).register(galactifun);
        new SpaceSuit(CoreCategory.EQUIPMENT, SPACE_SUIT_PANTS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {

        }, 2, 0).register(galactifun);
        new SpaceSuit(CoreCategory.EQUIPMENT, SPACE_SUIT_BOOTS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {

        }, 1, 0).register(galactifun);

        new CircuitPress(CoreCategory.MACHINES, CIRCUIT_PRESS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.HEATING_COIL, new ItemStack(Material.PISTON), SlimefunItems.HEATING_COIL,
                BaseMats.ALUMINUM_COMPOSITE_SHEET, null, BaseMats.ALUMINUM_COMPOSITE_SHEET,
                SlimefunItems.HEATING_COIL, new ItemStack(Material.PISTON), SlimefunItems.HEATING_COIL
        }).setCapacity(512).setEnergyConsumption(128).setProcessingSpeed(1).register(galactifun);

        /*
        new AssemblyTable(CoreCategory.MACHINES, ASSEMBLY_TABLE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.STEEL_PLATE, SlimefunItems.ENHANCED_AUTO_CRAFTER, SlimefunItems.STEEL_PLATE,
                SlimefunItems.CARGO_MOTOR, BaseMats.ADVANCED_PROCESSING_UNIT, SlimefunItems.CARGO_MOTOR,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.REINFORCED_PLATE, SlimefunItems.REINFORCED_PLATE
        }).register(galactifun);

        new StargateRing(CoreCategory.COMPONENTS, STARGATE_RING, AssemblyTable.TYPE, new ItemStack[] {
                BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET,
                BaseMats.ULTRA_DUTY_SHEET, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ULTRA_DUTY_SHEET,
                BaseMats.ULTRA_DUTY_SHEET, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ULTRA_DUTY_SHEET,
                BaseMats.ULTRA_DUTY_SHEET, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ULTRA_DUTY_SHEET,
                BaseMats.ULTRA_DUTY_SHEET, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ENDER_BLOCK, BaseMats.ULTRA_DUTY_SHEET,
                BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET
        }).register(galactifun);
        new StargateController(CoreCategory.COMPONENTS, STARGATE_CONTROLLER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                STARGATE_RING, BaseMats.GLOWSTONE_CIRCUIT, STARGATE_RING,
                BaseMats.REDSTONE_CIRCUIT, BaseMats.DIAMOND_CIRCUIT, BaseMats.REDSTONE_CIRCUIT,
                STARGATE_RING, BaseMats.LAPIS_CIRCUIT, STARGATE_RING
        }).register(galactifun);

        new Rocket(CoreCategory.ITEMS, TIER_ONE, AssemblyTable.TYPE, new ItemStack[] {
                null, null, BaseMats.NOSE_CONE, BaseMats.NOSE_CONE, null, null,
                null, null, BaseMats.HEAVY_DUTY_SHEET, BaseMats.HEAVY_DUTY_SHEET, null, null,
                null, BaseMats.HEAVY_DUTY_SHEET, BaseMats.ADVANCED_PROCESSING_UNIT, BaseMats.ADVANCED_PROCESSING_UNIT, BaseMats.HEAVY_DUTY_SHEET, null,
                BaseMats.HEAVY_DUTY_SHEET, BaseMats.FUEL_TANK, BaseMats.LIFE_SUPPORT_MODULE, BaseMats.LIFE_SUPPORT_MODULE, BaseMats.FUEL_TANK, BaseMats.HEAVY_DUTY_SHEET,
                BaseMats.HEAVY_DUTY_SHEET, BaseMats.FUEL_TANK, BaseMats.FUEL_TANK, BaseMats.FUEL_TANK, BaseMats.FUEL_TANK, BaseMats.HEAVY_DUTY_SHEET,
                BaseMats.HEAVY_DUTY_SHEET, null, BaseMats.ROCKET_ENGINE, BaseMats.ROCKET_ENGINE, null, BaseMats.HEAVY_DUTY_SHEET
        }, TIER_ONE_FUEL, TIER_ONE_STORAGE).register(galactifun);
        new Rocket(CoreCategory.ITEMS, TIER_TWO, AssemblyTable.TYPE, new ItemStack[] {
                null, null, BaseMats.NOSE_CONE, BaseMats.NOSE_CONE, null, null,
                null, null, BaseMats.HEAVY_DUTY_SHEET, BaseMats.HEAVY_DUTY_SHEET, null, null,
                null, BaseMats.HEAVY_DUTY_SHEET, BaseMats.ADVANCED_PROCESSING_UNIT, BaseMats.ADVANCED_PROCESSING_UNIT, BaseMats.HEAVY_DUTY_SHEET, null,
                BaseMats.HEAVY_DUTY_SHEET, BaseMats.FUEL_TANK, BaseMats.LIFE_SUPPORT_MODULE, BaseMats.LIFE_SUPPORT_MODULE, BaseMats.FUEL_TANK, BaseMats.HEAVY_DUTY_SHEET,
                BaseMats.HEAVY_DUTY_SHEET, BaseMats.FUEL_TANK, BaseMats.FUEL_TANK, BaseMats.FUEL_TANK, BaseMats.FUEL_TANK, BaseMats.HEAVY_DUTY_SHEET,
                BaseMats.HEAVY_DUTY_SHEET, null, BaseMats.ROCKET_ENGINE_2, BaseMats.ROCKET_ENGINE_2, null, BaseMats.HEAVY_DUTY_SHEET
        }, TIER_TWO_FUEL, TIER_TWO_STORAGE).register(galactifun);
        new Rocket(CoreCategory.ITEMS, TIER_THREE, AssemblyTable.TYPE, new ItemStack[] {
                null, null, BaseMats.NOSE_CONE, BaseMats.NOSE_CONE, null, null,
                null, null, BaseMats.ULTRA_DUTY_SHEET, BaseMats.ULTRA_DUTY_SHEET, null, null,
                null, BaseMats.HEAVY_DUTY_SHEET, BaseMats.ADVANCED_PROCESSING_UNIT, BaseMats.ADVANCED_PROCESSING_UNIT, BaseMats.ULTRA_DUTY_SHEET, null,
                BaseMats.ULTRA_DUTY_SHEET, BaseMats.FUEL_TANK_2, BaseMats.LIFE_SUPPORT_MODULE, BaseMats.LIFE_SUPPORT_MODULE, BaseMats.FUEL_TANK_2, BaseMats.ULTRA_DUTY_SHEET,
                BaseMats.ULTRA_DUTY_SHEET, BaseMats.FUEL_TANK_2, BaseMats.FUEL_TANK, BaseMats.FUEL_TANK, BaseMats.FUEL_TANK_2, BaseMats.ULTRA_DUTY_SHEET,
                BaseMats.ULTRA_DUTY_SHEET, null, BaseMats.ROCKET_ENGINE_3, BaseMats.ROCKET_ENGINE_3, null, BaseMats.ULTRA_DUTY_SHEET
        }, TIER_THREE_FUEL, TIER_THREE_STORAGE).register(galactifun);
        */

        new SlimefunItem(CoreCategory.ITEMS, LANDING_HATCH, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                BaseMats.HEAVY_DUTY_SHEET, new ItemStack(Material.IRON_TRAPDOOR), BaseMats.HEAVY_DUTY_SHEET,
                BaseMats.SPACE_GRADE_PLATE, null, BaseMats.SPACE_GRADE_PLATE,
                BaseMats.SPACE_GRADE_PLATE, null, BaseMats.SPACE_GRADE_PLATE
        }).register(galactifun);

        new LaunchPadFloor(CoreCategory.ITEMS, BaseItems.LAUNCH_PAD_FLOOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                null, null, null,
                BaseMats.HEAVY_DUTY_SHEET, BaseMats.HEAVY_DUTY_SHEET, BaseMats.HEAVY_DUTY_SHEET,
                BaseMats.HEAVY_DUTY_SHEET, BaseMats.HEAVY_DUTY_SHEET, BaseMats.HEAVY_DUTY_SHEET,
        }).register(galactifun);

        new LaunchPadCore(CoreCategory.ITEMS, BaseItems.LAUNCH_PAD_CORE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.REINFORCED_PLATE, BaseMats.NOZZLE, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.CARGO_MOTOR, SlimefunItems.OIL_PUMP, SlimefunItems.CARGO_MOTOR,
                SlimefunItems.REINFORCED_PLATE, BaseMats.ADVANCED_PROCESSING_UNIT, SlimefunItems.REINFORCED_PLATE,
        }).register(galactifun);

        new CoolingUnit(COOLING_UNIT_1, new ItemStack[] {
                BaseMats.ALUMINUM_COMPOSITE_SHEET, SlimefunItems.COOLING_UNIT, BaseMats.ALUMINUM_COMPOSITE_SHEET,
                SlimefunItems.COOLING_UNIT, BaseMats.FAN_BLADE, SlimefunItems.COOLING_UNIT,
                BaseMats.ALUMINUM_COMPOSITE_SHEET, SlimefunItems.COOLING_UNIT, BaseMats.ALUMINUM_COMPOSITE_SHEET
        }, 1).register(galactifun);

        new CoolingUnit(COOLING_UNIT_2, new ItemStack[] {
                BaseMats.SPACE_GRADE_PLATE, BaseMats.DRY_ICE, BaseMats.SPACE_GRADE_PLATE,
                BaseMats.DRY_ICE, COOLING_UNIT_1, BaseMats.DRY_ICE,
                BaseMats.SPACE_GRADE_PLATE, BaseMats.DRY_ICE, BaseMats.SPACE_GRADE_PLATE
        }, 2).register(galactifun);

        new CoolingUnit(COOLING_UNIT_3, new ItemStack[] {
                BaseMats.HEAVY_DUTY_SHEET, BaseMats.DRY_ICE, BaseMats.HEAVY_DUTY_SHEET,
                BaseMats.DRY_ICE, COOLING_UNIT_2, BaseMats.DRY_ICE,
                BaseMats.HEAVY_DUTY_SHEET, BaseMats.DRY_ICE, BaseMats.HEAVY_DUTY_SHEET
        }, 3).register(galactifun);

        new SpaceHeater(SPACE_HEATER_1, new ItemStack[] {
                BaseMats.ALUMINUM_COMPOSITE_SHEET, SlimefunItems.HEATING_COIL, BaseMats.ALUMINUM_COMPOSITE_SHEET,
                SlimefunItems.HEATING_COIL, BaseMats.FAN_BLADE, SlimefunItems.HEATING_COIL,
                BaseMats.ALUMINUM_COMPOSITE_SHEET, SlimefunItems.HEATING_COIL, BaseMats.ALUMINUM_COMPOSITE_SHEET
        }, 1).register(galactifun);

        new SpaceHeater(SPACE_HEATER_2, new ItemStack[] {
                BaseMats.SPACE_GRADE_PLATE, new ItemStack(Material.LAVA_BUCKET), BaseMats.SPACE_GRADE_PLATE,
                BaseMats.VENTSTONE, SPACE_HEATER_1, BaseMats.VENTSTONE,
                BaseMats.SPACE_GRADE_PLATE, SlimefunItems.HEATING_COIL, BaseMats.SPACE_GRADE_PLATE
        }, 2).register(galactifun);

        new SpaceHeater(SPACE_HEATER_3, new ItemStack[] {
                BaseMats.HEAVY_DUTY_SHEET, BaseMats.VOLCANIC_INGOT, BaseMats.HEAVY_DUTY_SHEET,
                BaseMats.VOLCANIC_INGOT, SPACE_HEATER_2, BaseMats.VOLCANIC_INGOT,
                BaseMats.HEAVY_DUTY_SHEET, BaseMats.VOLCANIC_INGOT, BaseMats.HEAVY_DUTY_SHEET
        }, 3).register(galactifun);

        new IonDisperser(ION_DISPERSER_1, new ItemStack[] {
                BaseMats.ALUMINUM_COMPOSITE_SHEET, BaseMats.FAN_BLADE, BaseMats.ALUMINUM_COMPOSITE_SHEET,
                new ItemStack(Material.PRISMARINE_CRYSTALS), BaseMats.SULFUR_BLOCK, new ItemStack(Material.PRISMARINE_CRYSTALS),
                BaseMats.ALUMINUM_COMPOSITE_SHEET, BaseMats.VENTSTONE, BaseMats.ALUMINUM_COMPOSITE_SHEET
        }, 1).register(galactifun);

        new IonDisperser(ION_DISPERSER_2, new ItemStack[] {
                BaseMats.SPACE_GRADE_PLATE, BaseMats.FAN_BLADE, BaseMats.SPACE_GRADE_PLATE,
                BaseMats.SULFUR_BLOCK, ION_DISPERSER_1, BaseMats.SULFUR_BLOCK,
                BaseMats.SPACE_GRADE_PLATE, BaseMats.VOLCANIC_INGOT, BaseMats.SPACE_GRADE_PLATE
        }, 2).register(galactifun);

        new Observatory(OBSERVATORY, new ItemStack[] {
                new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.PISTON), new ItemStack(Material.IRON_BLOCK),
                new ItemStack(Material.PISTON), BaseMats.LUNAR_GLASS, new ItemStack(Material.PISTON),
                new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.PISTON), new ItemStack(Material.IRON_BLOCK)
        }).register(galactifun);
        new PlanetaryAnalyzer(PLANETARY_ANALYZER, new ItemStack[] {
                BaseMats.TUNGSTEN_INGOT, SlimefunItems.GPS_TRANSMITTER_4, BaseMats.TUNGSTEN_INGOT,
                BaseMats.SPACE_GRADE_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, BaseMats.SPACE_GRADE_PLATE,
                BaseMats.TUNGSTEN_INGOT, BaseMats.VOLCANIC_INGOT, BaseMats.TUNGSTEN_INGOT
        }).register(galactifun);
        new DiamondAnvil(DIAMOND_ANVIL, new ItemStack[] {
                BaseMats.ULTRA_DUTY_SHEET, new ItemStack(Material.GLASS), BaseMats.ULTRA_DUTY_SHEET,
                BaseMats.ULTRA_DUTY_SHEET, BaseMats.DIAMOND_ANVIL_CELL, BaseMats.ULTRA_DUTY_SHEET,
                BaseMats.ULTRA_DUTY_SHEET, new ItemStack(Material.ANVIL), BaseMats.ULTRA_DUTY_SHEET
        }).setCapacity(2048).setEnergyConsumption(512).setProcessingSpeed(1).register(galactifun);

        new OxygenSealer(OXYGEN_SEALER, new ItemStack[] {

        }, 300).register(galactifun);

        new SlimefunItem(CoreCategory.ITEMS, SUPER_FAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                BaseMats.ALUMINUM_COMPOSITE_SHEET, BaseMats.ALUMINUM_COMPOSITE_SHEET, BaseMats.ALUMINUM_COMPOSITE_SHEET,
                BaseMats.ALUMINUM_COMPOSITE_SHEET, BaseMats.FAN_BLADE, BaseMats.ALUMINUM_COMPOSITE_SHEET,
                BaseMats.ALUMINUM_COMPOSITE_SHEET, BaseMats.VENTSTONE, BaseMats.ALUMINUM_COMPOSITE_SHEET
        }).register(galactifun);

        new AutomaticDoor(AUTOMATIC_DOOR, new ItemStack[]{
                BaseMats.ALUMINUM_COMPOSITE_SHEET, new ItemStack(Material.OBSERVER), BaseMats.ALUMINUM_COMPOSITE_SHEET,
                BaseMats.ALUMINUM_COMPOSITE_SHEET, SlimefunItems.PROGRAMMABLE_ANDROID_MINER, BaseMats.ALUMINUM_COMPOSITE_SHEET,
                BaseMats.ALUMINUM_COMPOSITE_SHEET, SlimefunItems.BLOCK_PLACER, BaseMats.ALUMINUM_COMPOSITE_SHEET
        }).register(galactifun);
    }

}
