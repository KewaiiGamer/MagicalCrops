package magicalcrops;

import magicalcrops.items.MagicalCrops;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.ItemRegistry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.inventory.item.Item;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
import necesse.level.gameObject.SeedObject;

import java.awt.*;

@ModEntry
public class Main {

    public void init() {
        SeedObject.registerSeedObjects("kew_copper_seed", "kew_copper_crop", "kew_copper_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
        SeedObject.registerSeedObjects("kew_iron_seed", "kew_iron_crop", "kew_iron_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
        SeedObject.registerSeedObjects("kew_gold_seed", "kew_gold_crop", "kew_gold_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
        SeedObject.registerSeedObjects("kew_fire_seed", "kew_fire_crop", "kew_fire_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
        SeedObject.registerSeedObjects("kew_water_seed", "kew_water_crop", "kew_water_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
        SeedObject.registerSeedObjects("kew_wood_seed", "kew_wood_crop", "kew_wood_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
        SeedObject.registerSeedObjects("kew_stone_seed", "kew_stone_crop", "kew_stone_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
        SeedObject.registerSeedObjects("kew_tier_1_seed", "kew_tier_1_crop", "kew_tier_1_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
        SeedObject.registerSeedObjects("kew_tier_2_seed", "kew_tier_2_crop", "kew_tier_2_essence", 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
        ItemRegistry.registerItem("kew_copper_essence", (new MagicalCrops(100, Item.Rarity.UNCOMMON).cropTexture("kew_copper_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
        ItemRegistry.registerItem("kew_iron_essence", (new MagicalCrops(100, Item.Rarity.UNCOMMON).cropTexture("kew_iron_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
        ItemRegistry.registerItem("kew_gold_essence", (new MagicalCrops(100, Item.Rarity.UNCOMMON).cropTexture("kew_gold_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
        ItemRegistry.registerItem("kew_tier_1_essence", (new MagicalCrops(100, Item.Rarity.COMMON).cropTexture("kew_tier_1_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
        ItemRegistry.registerItem("kew_tier_2_essence", (new MagicalCrops(100, Item.Rarity.UNCOMMON).cropTexture("kew_tier_2_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
        ItemRegistry.registerItem("kew_fire_essence", (new MagicalCrops(100, Item.Rarity.COMMON).cropTexture("kew_fire_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
        ItemRegistry.registerItem("kew_water_essence", (new MagicalCrops(100, Item.Rarity.COMMON).cropTexture("kew_water_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
        ItemRegistry.registerItem("kew_wood_essence", (new MagicalCrops(100, Item.Rarity.COMMON).cropTexture("kew_wood_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
        ItemRegistry.registerItem("kew_stone_essence", (new MagicalCrops(100, Item.Rarity.COMMON).cropTexture("kew_stone_crop").addGlobalIngredient("anycompostable")), 2.0F, true);
    }

    public void postInit() {
        Recipes.registerModRecipe(new Recipe(
                "kew_tier_2_essence",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 8),
                        new Ingredient("demonicbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_tier_1_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 8),
                        new Ingredient("grassseed", 1),
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_tier_2_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_2_essence", 8),
                        new Ingredient("kew_tier_1_seed", 1),
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_copper_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_2_essence", 4),
                        new Ingredient("kew_tier_2_seed", 1),
                        new Ingredient("copperbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_iron_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_2_essence", 4),
                        new Ingredient("kew_tier_2_seed", 1),
                        new Ingredient("ironbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_gold_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_2_essence", 4),
                        new Ingredient("kew_tier_2_seed", 1),
                        new Ingredient("goldbar", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_water_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 4),
                        new Ingredient("kew_tier_1_seed", 1),
                        new Ingredient("watertile", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_fire_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 4),
                        new Ingredient("kew_tier_1_seed", 1),
                        new Ingredient("lavatile", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_wood_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 4),
                        new Ingredient("kew_tier_1_seed", 1),
                        new Ingredient("oaklog", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_wood_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 4),
                        new Ingredient("kew_tier_1_seed", 1),
                        new Ingredient("palmlog", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_wood_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 4),
                        new Ingredient("kew_tier_1_seed", 1),
                        new Ingredient("pinelog", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_wood_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 4),
                        new Ingredient("kew_tier_1_seed", 1),
                        new Ingredient("sprucelog", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_wood_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 4),
                        new Ingredient("kew_tier_1_seed", 1),
                        new Ingredient("willowlog", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "kew_stone_seed",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 4),
                        new Ingredient("kew_tier_1_seed", 1),
                        new Ingredient("stone", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "copperore",
                1,
                RecipeTechRegistry.FORGE,
                new Ingredient[]{
                        new Ingredient("kew_copper_essence", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "ironore",
                1,
                RecipeTechRegistry.FORGE,
                new Ingredient[]{
                        new Ingredient("kew_iron_essence", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "goldore",
                1,
                RecipeTechRegistry.FORGE,
                new Ingredient[]{
                        new Ingredient("kew_gold_essence", 4)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "stone",
                1,
                RecipeTechRegistry.DEMONIC_WORKSTATION,
                new Ingredient[]{
                        new Ingredient("kew_tier_1_essence", 4),
                        new Ingredient("kew_tier_1_seed", 1),
                        new Ingredient("stone", 4)
                }
        ));
    }

}
