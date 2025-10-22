package magicalcrops.items;

import necesse.engine.registries.ItemRegistry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.gfx.gameTexture.GameTexture;
import necesse.inventory.item.Item;
import necesse.inventory.item.matItem.MatItem;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
import necesse.inventory.recipe.Tech;
import necesse.level.gameObject.SeedObject;

import java.awt.*;
import java.util.Arrays;
import java.util.stream.Collectors;

import static necesse.inventory.recipe.Recipes.ingredientsFromScript;

public class MagicalCrops extends MatItem {
  protected String cropTextureName;
  public String seedType;
  public String resources;
  public String crop;
  public int tier;
  public Tech tech;
  public String outputResources;

  public MagicalCrops(int stackSize, Item.Rarity rarity, String resources, String outputResources, String crop, String seedType, int tier, Tech tech) {
    super(stackSize, rarity);
    this.seedType = seedType;
    this.crop = crop;
    this.outputResources = outputResources;
    this.resources = resources;
    this.tier = tier;
    this.tech = tech;
  }

  @Override
  protected void loadItemTextures() {
    if (this.cropTextureName != null) {
      this.itemTexture = new GameTexture(GameTexture.fromFile("objects/" + this.cropTextureName), 0, 0, 32);
    } else {
      super.loadItemTextures();
    }
  }

  public MagicalCrops cropTexture(String textureName) {
    this.cropTextureName = textureName;
    return this;
  }

  public void doInit() {
    registerCrop();
    registerItem();
  }

  public void doPostInit() {
    registerModRecipes();
  }


  public void registerCrop() {
    SeedObject.registerSeedObjects(getSeedLocale(), getCropLocale(), getEssenceLocale(), 1, 0, 5, 4200.0F, 6000.0F, new Color(90, 61, 48), 1.0F);
  }

  public void registerItem() {

    ItemRegistry.registerItem(getEssenceLocale(), this.cropTexture(getCropLocale()).addGlobalIngredient("anycompostable"), 1.0F, true);
  }

  public void registerModRecipes() {
    registerEssenceRecipe();
    registerSeedRecipe();
  }

  public void registerEssenceRecipe() {
    if (resources == null) return;
    if (seedType.equals("resource") || seedType.equals("any")) {

      if (outputResources == null) return;
      for (String outputResource : outputResources.split(",")) {
        String[] parts = outputResource.split(":");
        Recipes.registerModRecipe(new Recipe(
            parts[0],
            1,
            seedType.equals("any") ? RecipeTechRegistry.WORKSTATION : RecipeTechRegistry.FORGE,
            ingredientsFromScript(String.format("{{%s, %s}}", getEssenceLocale(), parts.length > 1 ? parts[1] : 4))
        ));
      }
    } else if (seedType.equals("essence")) {
      String formatted = Arrays.stream(resources.split(",")).map(s -> String.format("{%s, 1}", s))
          .collect(Collectors.joining(", "));
      Recipes.registerModRecipe(new Recipe(
          getEssenceLocale(),
          1,
          tech,
          ingredientsFromScript(String.format("{{%s, 8}, %s}", getPreviousTierSeedLocale(), formatted))
      ));
    }
  }

  public void registerSeedRecipe() {
    if (seedType.equals("resource") || seedType.equals("any")) {
      if (resources == null) return;
      String formatted = Arrays.stream(resources.split(","))
          .map(s -> String.format("{%s, 4}", s))
          .collect(Collectors.joining(", "));
      Recipes.registerModRecipe(new Recipe(
          getSeedLocale(),
          1,
          tech,
          ingredientsFromScript(String.format("{{%s, 4}, {%s, 1}, %s}", getTierEssenceLocale(), getTierSeedLocale(), formatted))
      ));
    } else if (seedType.equals("essence")) {
      Recipes.registerModRecipe(new Recipe(
          getSeedLocale(),
          1,
          tech,
          ingredientsFromScript(String.format("{{%s, 8}, {%s, 1}}", getEssenceLocale(), getPreviousTierSeedLocale()))
      ));
    }
  }


  public String getEssenceLocale() {
    return String.format("kew_%s_essence", this.crop);
  }

  public String getSeedLocale() {
    return String.format("kew_%s_seed", this.crop);
  }

  public String getCropLocale() {
    return String.format("kew_%s_crop", this.crop);
  }

  public String getTierSeedLocale() {
    return String.format("kew_tier_%s_seed", this.tier);
  }

  public String getTierEssenceLocale() {
    return String.format("kew_tier_%s_essence", this.tier);
  }

  public String getPreviousTierSeedLocale() {
    if (this.tier == 1) {
      return "grassseed";
    }
    return String.format("kew_tier_%s_seed", this.tier - 1);
  }
}
