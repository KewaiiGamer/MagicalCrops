package magicalcrops;

import necesse.engine.modLoader.annotations.ModConstructorPatch;
import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.entity.mobs.Attacker;
import necesse.entity.mobs.Mob;
import necesse.inventory.lootTable.LootItemInterface;
import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.LootItem;
import net.bytebuddy.asm.Advice;

import java.util.HashSet;

@ModMethodPatch(
    target = Mob.class,
    name = "onDeath",
    arguments = {Attacker.class, HashSet.class}
)
public class MobDeathPatch {
  @Advice.OnMethodEnter
  static void onEnter(@Advice.This Mob mob, @Advice.Argument(0) Attacker attacker, @Advice.Argument(1) HashSet<Attacker> attackers) {
    if (mob.isHostile) {
      if (attacker != null && attacker.getAttackOwner() != null && attacker.getAttackOwner().isPlayer) {
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        if (rand <= 15) {
          LootItemInterface item = LootItem.between("kew_tier_1_essence", 1, 1);
          mob.getLootTable().items.add(item);
        }
      }
    }
  }
}