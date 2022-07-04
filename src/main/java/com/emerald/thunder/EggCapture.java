package com.emerald.thunder;

import java.util.Random;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.entity.Entity;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Location;

import org.bukkit.Material;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import org.bukkit.World;

public class EggCapture extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        Entity damager = event.getDamager();

        if (damager instanceof Egg) {
            Entity entity = event.getEntity();

            Random random = new Random();

            if (random.nextInt(1, 5) == 1) {
                // Replace entity with spawn egg

                Material material = null;

                if (entity instanceof Bat) {
                    material = Material.BAT_SPAWN_EGG;
                } else if (entity instanceof Blaze) {
                    material = Material.BLAZE_SPAWN_EGG;
                } else if (entity instanceof CaveSpider) {
                    material = Material.CAVE_SPIDER_SPAWN_EGG;
                } else if (entity instanceof Chicken) {
                    material = Material.CHICKEN_SPAWN_EGG;
                } else if (entity instanceof Cod) {
                    material = Material.COD_SPAWN_EGG;
                } else if (entity instanceof Cow) {
                    material = Material.COW_SPAWN_EGG;
                } else if (entity instanceof Creeper) {
                    material = Material.CREEPER_SPAWN_EGG;
                } else if (entity instanceof Dolphin) {
                    material = Material.DOLPHIN_SPAWN_EGG;
                } else if (entity instanceof Donkey) {
                    material = Material.DONKEY_SPAWN_EGG;
                } else if (entity instanceof Drowned) {
                    material = Material.DROWNED_SPAWN_EGG;
                } else if (entity instanceof ElderGuardian) {
                    material = Material.ELDER_GUARDIAN_SPAWN_EGG;
                } else if (entity instanceof Enderman) {
                    material = Material.ENDERMAN_SPAWN_EGG;
                } else if (entity instanceof Endermite) {
                    material = Material.ENDERMITE_SPAWN_EGG;
                } else if (entity instanceof Evoker) {
                    material = Material.EVOKER_SPAWN_EGG;
                } else if (entity instanceof Ghast) {
                    material = Material.GHAST_SPAWN_EGG;
                } else if (entity instanceof Guardian) {
                    material = Material.GUARDIAN_SPAWN_EGG;
                } else if (entity instanceof Horse) {
                    material = Material.HORSE_SPAWN_EGG;
                } else if (entity instanceof Husk) {
                    material = Material.HUSK_SPAWN_EGG;
                } else if (entity instanceof Llama) {
                    material = Material.LLAMA_SPAWN_EGG;
                } else if (entity instanceof MagmaCube) {
                    material = Material.MAGMA_CUBE_SPAWN_EGG;
                } else if (entity instanceof MushroomCow) {
                    material = Material.MOOSHROOM_SPAWN_EGG;
                } else if (entity instanceof Mule) {
                    material = Material.MULE_SPAWN_EGG;
                } else if (entity instanceof Ocelot) {
                    material = Material.OCELOT_SPAWN_EGG;
                } else if (entity instanceof Parrot) {
                    material = Material.PARROT_SPAWN_EGG;
                } else if (entity instanceof Phantom) {
                    material = Material.PHANTOM_SPAWN_EGG;
                } else if (entity instanceof Pig) {
                    material = Material.PIG_SPAWN_EGG;
                } else if (entity instanceof PolarBear) {
                    material = Material.POLAR_BEAR_SPAWN_EGG;
                } else if (entity instanceof PufferFish) {
                    material = Material.PUFFERFISH_SPAWN_EGG;
                } else if (entity instanceof Rabbit) {
                    material = Material.RABBIT_SPAWN_EGG;
                } else if (entity instanceof Salmon) {
                    material = Material.SALMON_SPAWN_EGG;
                } else if (entity instanceof Sheep) {
                    material = Material.SHEEP_SPAWN_EGG;
                } else if (entity instanceof Shulker) {
                    material = Material.SHULKER_SPAWN_EGG;
                } else if (entity instanceof Silverfish) {
                    material = Material.SILVERFISH_SPAWN_EGG;
                } else if (entity instanceof Skeleton) {
                    material = Material.SKELETON_SPAWN_EGG;
                } else if (entity instanceof SkeletonHorse) {
                    material = Material.SKELETON_HORSE_SPAWN_EGG;
                } else if (entity instanceof Slime) {
                    material = Material.SLIME_SPAWN_EGG;
                } else if (entity instanceof Spider) {
                    material = Material.SPIDER_SPAWN_EGG;
                } else if (entity instanceof Squid) {
                    material = Material.SQUID_SPAWN_EGG;
                } else if (entity instanceof Stray) {
                    material = Material.STRAY_SPAWN_EGG;
                } else if (entity instanceof TropicalFish) {
                    material = Material.TROPICAL_FISH_SPAWN_EGG;
                } else if (entity instanceof Turtle) {
                    material = Material.TURTLE_SPAWN_EGG;
                } else if (entity instanceof Vex) {
                    material = Material.VEX_SPAWN_EGG;
                } else if (entity instanceof Villager) {
                    material = Material.VILLAGER_SPAWN_EGG;
                } else if (entity instanceof Vindicator) {
                    material = Material.VINDICATOR_SPAWN_EGG;
                } else if (entity instanceof Witch) {
                    material = Material.WITCH_SPAWN_EGG;
                } else if (entity instanceof WitherSkeleton) {
                    material = Material.WITHER_SKELETON_SPAWN_EGG;
                } else if (entity instanceof Wolf) {
                    material = Material.WOLF_SPAWN_EGG;
                } else if (entity instanceof Cat) {
                    material = Material.CAT_SPAWN_EGG;
                } else if (entity instanceof Fox) {
                    material = Material.FOX_SPAWN_EGG;
                } else if (entity instanceof Panda) {
                    material = Material.PANDA_SPAWN_EGG;
                } else if (entity instanceof Pillager) {
                    material = Material.PILLAGER_SPAWN_EGG;
                } else if (entity instanceof Ravager) {
                    material = Material.RAVAGER_SPAWN_EGG;
                } else if (entity instanceof TraderLlama) {
                    material = Material.TRADER_LLAMA_SPAWN_EGG;
                } else if (entity instanceof WanderingTrader) {
                    material = Material.WANDERING_TRADER_SPAWN_EGG;
                } else if (entity instanceof Bee) {
                    material = Material.BEE_SPAWN_EGG;
                } else if (entity instanceof Hoglin) {
                    material = Material.HOGLIN_SPAWN_EGG;
                } else if (entity instanceof Piglin) {
                    material = Material.PIGLIN_SPAWN_EGG;
                } else if (entity instanceof Strider) {
                    material = Material.STRIDER_SPAWN_EGG;
                } else if (entity instanceof Zoglin) {
                    material = Material.ZOGLIN_SPAWN_EGG;
                } else if (entity instanceof PigZombie) {
                    material = Material.ZOMBIFIED_PIGLIN_SPAWN_EGG;
                } else if (entity instanceof Axolotl) {
                    material = Material.AXOLOTL_SPAWN_EGG;
                } else if (entity instanceof GlowSquid) {
                    material = Material.GLOW_SQUID_SPAWN_EGG;
                } else if (entity instanceof Goat) {
                    material = Material.GOAT_SPAWN_EGG;
                } else if (entity instanceof PiglinBrute) {
                    material = Material.PIGLIN_BRUTE_SPAWN_EGG;
                } else if (entity instanceof Zombie) {
                    material = Material.ZOMBIE_SPAWN_EGG;
                } else if (entity instanceof ZombieHorse) {
                    material = Material.ZOMBIE_HORSE_SPAWN_EGG;
                } else if (entity instanceof ZombieVillager) {
                    material = Material.ZOMBIE_VILLAGER_SPAWN_EGG;
                }

                if (material != null) {
                    ItemStack spawnEgg = new ItemStack(material);

                    World world = entity.getWorld();
                    Location location = entity.getLocation();

                    entity.remove();

                    world.dropItem(location, spawnEgg);
                }

            }
        }
    }
}
