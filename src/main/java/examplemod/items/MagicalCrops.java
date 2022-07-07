package examplemod.items;

import necesse.gfx.gameTexture.GameTexture;
import necesse.inventory.item.Item;

public class MagicalCrops extends Item {
    protected String cropTextureName;

    public MagicalCrops(int stackSize) {
        super(stackSize);
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
