package magicalcrops;

import magicalcrops.items.MagicalCrops;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.ItemRegistry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.item.Item;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
import necesse.level.gameObject.SeedObject;

import java.awt.*;

import static necesse.inventory.recipe.Recipes.ingredientsFromScript;

@ModEntry
public class Main {

  public void init() {
    // Tier Essences
    SeedObject.registerSeedObjects("kew_tier_1_seed", "kew_tier_1_crop", "kew_tier_1_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_tier_2_seed", "kew_tier_2_crop", "kew_tier_2_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_tier_3_seed", "kew_tier_3_crop", "kew_tier3_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_tier_4_seed", "kew_tier_4_crop", "kew_tier42_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    ItemRegistry.registerItem("kew_tier_1_essence", (new MagicalCrops(100, Item.Rarity.NORMAL).cropTexture("kew_tier_1_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_tier_2_essence", (new MagicalCrops(100, Item.Rarity.COMMON).cropTexture("kew_tier_2_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_tier_3_essence", (new MagicalCrops(100, Item.Rarity.UNCOMMON).cropTexture("kew_tier_3_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_tier_4_essence", (new MagicalCrops(100, Item.Rarity.RARE).cropTexture("kew_tier_4_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    // Tier 1 resources
    SeedObject.registerSeedObjects("kew_fire_seed", "kew_fire_crop", "kew_fire_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_water_seed", "kew_water_crop", "kew_water_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_wood_seed", "kew_wood_crop", "kew_wood_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_stone_seed", "kew_stone_crop", "kew_stone_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    ItemRegistry.registerItem("kew_fire_essence", (new MagicalCrops(100, Item.Rarity.NORMAL).cropTexture("kew_fire_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_water_essence", (new MagicalCrops(100, Item.Rarity.NORMAL).cropTexture("kew_water_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_wood_essence", (new MagicalCrops(100, Item.Rarity.NORMAL).cropTexture("kew_wood_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_stone_essence", (new MagicalCrops(100, Item.Rarity.NORMAL).cropTexture("kew_stone_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    // Tier 2 Resources
    SeedObject.registerSeedObjects("kew_copper_seed", "kew_copper_crop", "kew_copper_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_iron_seed", "kew_iron_crop", "kew_iron_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_gold_seed", "kew_gold_crop", "kew_gold_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    ItemRegistry.registerItem("kew_copper_essence", (new MagicalCrops(100, Item.Rarity.COMMON).cropTexture("kew_copper_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_iron_essence", (new MagicalCrops(100, Item.Rarity.COMMON).cropTexture("kew_iron_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_gold_essence", (new MagicalCrops(100, Item.Rarity.COMMON).cropTexture("kew_gold_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    // Tier 3 Resources
    SeedObject.registerSeedObjects("kew_mycelium_seed", "kew_mycelium_crop", "kew_mycelium_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_ancient_fossil_seed", "kew_ancient_fossil_crop", "kew_ancient_fossil_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_glacial_seed", "kew_glacial_crop", "kew_glacial_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    SeedObject.registerSeedObjects("kew_ivy_seed", "kew_ivy_crop", "kew_ivy_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    ItemRegistry.registerItem("kew_mycelium_essence", (new MagicalCrops(100, Item.Rarity.UNCOMMON).cropTexture("kew_mycelium_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_ancient_fossil_essence", (new MagicalCrops(100, Item.Rarity.UNCOMMON).cropTexture("kew_ancient_fossil_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_glacial_essence", (new MagicalCrops(100, Item.Rarity.UNCOMMON).cropTexture("kew_glacial_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    ItemRegistry.registerItem("kew_ivy_essence", (new MagicalCrops(100, Item.Rarity.UNCOMMON).cropTexture("kew_ivy_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    // Tier 4 Resources
    SeedObject.registerSeedObjects("kew_nightsteel_seed", "kew_nightsteel_crop", "kew_nightsteel_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
    ItemRegistry.registerItem("kew_nightsteel_essence", (new MagicalCrops(100, Item.Rarity.RARE).cropTexture("kew_nightsteel_crop").addGlobalIngredient("anycompostable")), 2.0F, true);

  }

  public void postInit() {
    // Tier Seeds
    Recipes.registerModRecipe(new Recipe(
        "kew_tier_1_seed",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_tier_1_essence, 8}, {grassseed, 1}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "kew_tier_2_seed",
        1,
        RecipeTechRegistry.DEMONIC_WORKSTATION,
        ingredientsFromScript("{{kew_tier_2_essence, 8}, {kew_tier_1_seed, 1}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "kew_tier_3_seed",
        1,
        RecipeTechRegistry.TUNGSTEN_WORKSTATION,
        ingredientsFromScript("{{kew_tier_3_essence, 8}, {kew_tier_2_seed, 1}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "kew_tier_4_seed",
        1,
        RecipeTechRegistry.FALLEN_WORKSTATION,
        ingredientsFromScript("{{kew_tier_4_essence, 8}, {kew_tier_3_seed, 1}}")
    ));
    // Tier Essences
    Recipes.registerModRecipe(new Recipe(
        "kew_tier_2_essence",
        1,
        RecipeTechRegistry.DEMONIC_WORKSTATION,
        ingredientsFromScript("{{kew_tier_1_essence, 8}, {copperbar, 1}, {goldbar, 1}, {ironbar, 1}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "kew_tier_3_essence",
        1,
        RecipeTechRegistry.TUNGSTEN_WORKSTATION,
        ingredientsFromScript("{{kew_tier_2_essence, 8}, {demonicbar, 1, ivybar, 1}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "kew_tier_4_essence",
        1,
        RecipeTechRegistry.FALLEN_WORKSTATION,
        ingredientsFromScript("{{kew_tier_3_essence, 8}, {ancientfossilbar, 1}, {glacialbar, 1}, {tungstenbar, 1}, {myceliumbar, 1}}")
    ));
    // Tier 1 Seeds
    Recipes.registerModRecipe(new Recipe(
        "kew_water_seed",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_tier_1_essence, 4}, {kew_tier_1_seed, 1}, {watertile, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "kew_fire_seed",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_tier_1_essence, 4}, {kew_tier_1_seed, 1}, {lavatile, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "kew_wood_seed",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_tier_1_essence, 4}, {kew_tier_1_seed, 1}, {anylog, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "kew_stone_seed",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_tier_1_essence, 4}, {kew_tier_1_seed, 1}, {stone, 4}}")
    ));
    // Tier 2 Seeds
    Recipes.registerModRecipe(new Recipe(
        "kew_copper_seed",
        1,
        RecipeTechRegistry.DEMONIC_WORKSTATION,
        ingredientsFromScript("{{kew_tier_2_essence, 4}, {kew_tier_2_seed, 1}, {copperbar, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "kew_iron_seed",
        1,
        RecipeTechRegistry.DEMONIC_WORKSTATION,
        ingredientsFromScript("{{kew_tier_2_essence, 4}, {kew_tier_2_seed, 1}, {ironbar, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "kew_gold_seed",
        1,
        RecipeTechRegistry.DEMONIC_WORKSTATION,
        ingredientsFromScript("{{kew_tier_2_essence, 4}, {kew_tier_2_seed, 1}, {goldbar, 4}}")
    ));
    // Tier 1 Resources
    Recipes.registerModRecipe(new Recipe(
        "stone",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_stone_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "oaklog",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_wood_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "sprucelog",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_wood_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "pinelog",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_wood_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "palmlog",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_wood_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "willowlog",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_wood_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "maplelog",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_wood_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "birchlog",
        1,
        RecipeTechRegistry.WORKSTATION,
        ingredientsFromScript("{{kew_wood_essence, 4}}")
    ));
    // Tier 2 Resources
    Recipes.registerModRecipe(new Recipe(
        "copperore",
        1,
        RecipeTechRegistry.FORGE,
        ingredientsFromScript("{{kew_copper_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "ironore",
        1,
        RecipeTechRegistry.FORGE,
        ingredientsFromScript("{{kew_iron_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "goldore",
        1,
        RecipeTechRegistry.FORGE,
        ingredientsFromScript("{{kew_gold_essence, 4}}")
    ));
    // Tier 3 Resources
    Recipes.registerModRecipe(new Recipe(
        "ivyore",
        1,
        RecipeTechRegistry.FORGE,
        ingredientsFromScript("{{kew_ivy_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "glacialore",
        1,
        RecipeTechRegistry.FORGE,
        ingredientsFromScript("{{kew_glacial_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "ancientfossilore",
        1,
        RecipeTechRegistry.FORGE,
        ingredientsFromScript("{{kew_ancient_fossil_essence, 4}}")
    ));
    Recipes.registerModRecipe(new Recipe(
        "myceliumore",
        1,
        RecipeTechRegistry.FORGE,
        ingredientsFromScript("{{kew_mycelium_essence, 4}}")
    ));
    // Tier 4 Resources
    Recipes.registerModRecipe(new Recipe(
        "nightsteelore",
        1,
        RecipeTechRegistry.FORGE,
        ingredientsFromScript("{{kew_nightsteel_essence, 4}}")
    ));
  }

}
