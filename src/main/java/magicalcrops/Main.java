package magicalcrops;

import magicalcrops.items.MagicalCrops;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.item.Item;
import necesse.inventory.recipe.Tech;

import java.util.ArrayList;

@ModEntry
public class Main {

  public ArrayList<MagicalCrops> magicalCrops = new ArrayList<>();

  public void init() {
    addCrop("tier_1", 1, null, null);
    addCrop("tier_2", 2, "copperbar,ironbar,goldbar", null);
    addCrop("tier_3", 3, "demonicbar,ivybar,frostshard,quartz", null);
    addCrop("tier_4", 4, "ancientfossilbar,myceliumbar,glacialbar,tungstenbar,obsidian,slimeum,spideritebar,lifequartz", null);
    addCrop("tier_5", 5, "emerald,ruby,sapphire,amethyst,alchemyshard,nightsteelbar,omnicrystal,pearlescentdiamond", null);
    addCrop("fire", 1, "lavatile", "custom:bucket:1+kew_fire_essence:8=lavatile:1");
    addCrop("water", 1, "watertile", "custom:bucket:1+kew_water_essence:8=watertile:1");
    addCrop("wood", 1, "anylog", "oaklog,sprucelog,pinelog,palmlog,willowlog,birchlog,maplelog");
    addCrop("stone", 1, "stone", "stone");
    addCrop("clay", 1, "clay", "clay");
    addCrop("copper", 2);
    addCrop("iron", 2);
    addCrop("gold", 2);
    addCrop("ivy", 3);
    addCrop("demonic", 3, "demonicbar", "demonicbar:16");
    addCrop("frostshard", 3, "frostshard", "frostshard:16");
    addCrop("quartz", 3, "quartz", "quartz");
    addCrop("mycelium", 4, "myceliumbar", "myceliumore:16");
    addCrop("ancientfossil", 4);
    addCrop("glacial", 4);
    addCrop("tungsten", 4);
    addCrop("obsidian", 4, "obsidian", "obsidian:16");
    addCrop("slimeum", 4, "slimeum", "slimeum:16");
    addCrop("spiderite", 4);
    addCrop("lifequartz", 4, "lifequartz", "lifequartz:16");

    addCrop("nightsteel", 5);
    addCrop("alchemyshard", 5, "alchemyshard", "alchemyshard:8");
    addCrop("amethyst", 5, "amethyst", "amethyst:16");
    addCrop("ruby", 5, "ruby", "ruby:16");
    addCrop("emerald", 5, "emerald", "emerald:16");
    addCrop("sapphire", 5, "sapphire", "sapphire:16");
    addCrop("omnicrystal", 5, "omnicrystal", "omnicrystal:16");
    addCrop("pearlescentdiamond", 5, "pearlescentdiamond", "pearlescentdiamond:16");
    addCrop("upgradeshard", 5, "upgradeshard", "upgradeshard:16");
    for (MagicalCrops crop : magicalCrops) {
      crop.doInit();
    }

  }

  public void addCrop(String crop, int tier, String resources, String outputResources) {
    Tech tech = techFromTier(tier);
    Item.Rarity rarity = rarityFromTier(tier);
    magicalCrops.add(new MagicalCrops(1000, rarity, resources, outputResources, crop, seedTypeFromCrop(crop), tier, tech));
  }

  public void addCrop(String crop, int tier) {
    Tech tech = techFromTier(tier);
    Item.Rarity rarity = rarityFromTier(tier);
    magicalCrops.add(new MagicalCrops(1000, rarity, String.format("%sbar", crop), String.format("%sore", crop), crop, seedTypeFromCrop(crop), tier, tech));
  }

  public Tech techFromTier(int tier) {

    switch (tier) {
      case 1:
        return RecipeTechRegistry.WORKSTATION;
      case 2:
        return RecipeTechRegistry.WORKSTATION;
      case 3:
        return RecipeTechRegistry.DEMONIC_WORKSTATION;
      case 4:
        return RecipeTechRegistry.TUNGSTEN_WORKSTATION;
      case 5:
        return RecipeTechRegistry.FALLEN_WORKSTATION;
      default:
        return null;
    }
  }

  public Item.Rarity rarityFromTier(int tier) {
    switch (tier) {
      case 1:
        return Item.Rarity.NORMAL;
      case 2:
        return Item.Rarity.COMMON;
      case 3:
        return Item.Rarity.UNCOMMON;
      case 4:
        return Item.Rarity.RARE;
      case 5:
        return Item.Rarity.EPIC;
      default:
        return null;
    }
  }

  public String seedTypeFromCrop(String crop) {
    if (crop.contains("tier_")) return "essence";
    if ("wood,stone,fire,water".contains(crop)) return "any";
    return "resource";
  }

  public void postInit() {
    for (MagicalCrops crop : magicalCrops) {
      crop.doPostInit();
    }
  }

}
