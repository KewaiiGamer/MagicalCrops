package examplemod.items;

import necesse.gfx.gameTexture.GameTexture;
import necesse.inventory.item.Item;

public class ResourceCrop extends Item {
    protected String cropTextureName;
    public ResourceCrop(int stackSize) {
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

    public ResourceCrop cropTexture(String textureName) {
        this.cropTextureName = textureName;
        return this;
    }
}
