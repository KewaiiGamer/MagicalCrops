package magicalcrops.items;

import necesse.gfx.gameTexture.GameTexture;
import necesse.inventory.item.Item;
import necesse.inventory.item.matItem.MatItem;

public class MagicalCrops extends MatItem {
    protected String cropTextureName;

    public MagicalCrops(int stackSize, Item.Rarity rarity) {
        super(stackSize, rarity);
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
}
