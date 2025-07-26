package examplemod;

import necesse.engine.GameEvents;
import necesse.engine.events.loot.MobLootTableDropsEvent;
import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.registries.ItemRegistry;
import necesse.engine.util.GameMath;
import necesse.engine.util.GameRandom;
import necesse.entity.mobs.Attacker;
import necesse.entity.mobs.Mob;
import necesse.entity.pickup.ItemPickupEntity;
import necesse.inventory.InventoryItem;
import net.bytebuddy.asm.Advice;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

@ModMethodPatch(
        target = Mob.class,
        name = "onDeath",
        arguments = {Attacker.class, HashSet.class}
)
public class MobDeathPatch {
    @Advice.OnMethodExit
    static void onExit(@Advice.This Mob mob, @Advice.Argument(0) Attacker attacker, @Advice.Argument(1) HashSet<Attacker> attackers) {
        if (mob.isHostile) {
            if (attacker != null && attacker.getAttackOwner() != null && attacker.getAttackOwner().isPlayer) {
                int max = 100;
                int min = 1;
                int range = max - min + 1;
                int rand = (int) (Math.random() * range) + min;
                if (rand <= 15) {
                    ArrayList<InventoryItem> drops = new ArrayList<>();
                    drops.add(ItemRegistry.getItem("kew_tier_1_essence").getDefaultLootItem(GameRandom.globalRandom, 1));
                    mob.getLootTable().addItems(drops, GameRandom.globalRandom, 1, mob);

                    Point publicLootPosition = mob.getLootDropsPosition(null);
                    publicLootPosition.x = GameMath.limit(publicLootPosition.x, 32, mob.getLevel().width * 32 - 32);
                    publicLootPosition.y = GameMath.limit(publicLootPosition.y, 32, mob.getLevel().height * 32 - 32);
                    MobLootTableDropsEvent dropEvent;
                    GameEvents.triggerEvent(dropEvent = new MobLootTableDropsEvent(mob, publicLootPosition, drops));
                    if (dropEvent.dropPos != null && dropEvent.drops != null) {

                        for (InventoryItem item : dropEvent.drops) {
                            ItemPickupEntity entity = item.getPickupEntity(mob.getLevel(), (float) dropEvent.dropPos.x, (float) dropEvent.dropPos.y);
                            mob.getLevel().entityManager.pickups.add(entity);
                            mob.itemsDropped.add(entity);
                        }
                    }
                }
            }
        }
    }
}
