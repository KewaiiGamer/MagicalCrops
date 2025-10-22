package magicalcrops;

import magicalcrops.items.MagicalCrops;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.item.Item;

import java.util.ArrayList;

@ModEntry
public class Main {

  public ArrayList<MagicalCrops> magicalCrops = new ArrayList<>();

  public void init() {
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.NORMAL, null, null, "tier_1", "essence", 1, RecipeTechRegistry.WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.COMMON, "copperbar,ironbar,goldbar", null, "tier_2", "essence", 2, RecipeTechRegistry.WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.UNCOMMON, "demonicbar,ivybar", null, "tier_3", "essence", 3, RecipeTechRegistry.DEMONIC_WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.RARE, "ancientfossilbar,myceliumbar,glacialbar,tungstenbar", null, "tier_4", "essence", 4, RecipeTechRegistry.TUNGSTEN_WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.NORMAL, "lavatile", null, "fire", "any", 1, RecipeTechRegistry.WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.NORMAL, "watertile", null, "water", "any", 1, RecipeTechRegistry.WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.NORMAL, "anylog", "oaklog,sprucelog,pinelog,palmlog,willowlog,birchlog,maplelog", "wood", "any", 1, RecipeTechRegistry.WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.NORMAL, "stone", "stone", "stone", "any", 1, RecipeTechRegistry.WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.COMMON, "copperbar", "copperore", "copper", "resource", 2, RecipeTechRegistry.WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.COMMON, "ironbar", "ironore", "iron", "resource", 2, RecipeTechRegistry.WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.COMMON, "goldbar", "goldore", "gold", "resource", 2, RecipeTechRegistry.WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.UNCOMMON, "ivybar", "ivyore", "ivy", "resource", 3, RecipeTechRegistry.DEMONIC_WORKSTATION));
    //magicalCrops.add(new MagicalCrops(100, Item.Rarity.UNCOMMON, "demonicbar","demonicbar:16","demonic", "resource", 3, RecipeTechRegistry.TUNGSTEN_WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.RARE, "myceliumbar", "myceliumore:16", "mycelium", "resource", 4, RecipeTechRegistry.TUNGSTEN_WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.RARE, "ancientfossilbar", "ancientfossilore", "ancient_fossil", "resource", 4, RecipeTechRegistry.TUNGSTEN_WORKSTATION));
    magicalCrops.add(new MagicalCrops(100, Item.Rarity.RARE, "glacialbar", "glacialore", "glacial", "resource", 4, RecipeTechRegistry.TUNGSTEN_WORKSTATION));
    //magicalCrops.add(new MagicalCrops(100, Item.Rarity.RARE, "tungstenbar","tungstenore", "tungsten", "resource", 4, RecipeTechRegistry.FALLEN_WORKSTATION));
    //magicalCrops.add(new MagicalCrops(100, Item.Rarity.EPIC, "nightsteelbar","nightsteelore","nightsteel", "resource", 5, RecipeTechRegistry.FALLEN_WORKSTATION));
    for (MagicalCrops crop : magicalCrops) {
      crop.doInit();
    }
  }

  public void postInit() {
    for (MagicalCrops crop : magicalCrops) {
      crop.doPostInit();
    }
  }

}
