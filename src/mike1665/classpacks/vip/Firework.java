package mike1665.classpacks.vip;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Builder;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.scheduler.BukkitRunnable;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.main.SCB;


public class Firework implements ClassInterface{
	
	private static final Random r = new Random();

	@Override
	public void ArrowHit(Player paramPlayer, Entity paramEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Attack(Player paramPlayer1, Player paramPlayer2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Death(Player paramPlayer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String DisplayName() {
		return ChatColor.DARK_RED + "[FireWork] " + ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.FIREWORK);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.GOLD + "Firework");
	    icon.setItemMeta(im);
	    return icon;
	}

	@Override
	public boolean Jump(Player paramPlayer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Movement(Player paramPlayer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void RightClick(final Player player, Action paramAction, Block paramBlock) {
		if (a(player) && paramBlock != null) {
			player.getItemInHand().setType(Material.AIR);
			final org.bukkit.entity.Firework fw = (org.bukkit.entity.Firework) player.getWorld().spawnEntity(paramBlock.getLocation().add(0.5, 1.2, 0.5), EntityType.FIREWORK);
			Builder builder = FireworkEffect.builder();
			FireworkMeta m = fw.getFireworkMeta();
			builder.trail(r.nextBoolean()).flicker(r.nextBoolean());
			builder.withColor(Color.fromRGB(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
			builder.with(Type.values()[r.nextInt(Type.values().length)]);
			builder.withFade(Color.fromRGB(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
			m.addEffect(builder.build());
			m.setPower(r.nextInt(3)+1);
			fw.setFireworkMeta(m);
			fw.setPassenger(player);
			new BukkitRunnable() {
				
				@Override
				public void run() {
					if(fw.isDead() || !fw.isValid()) {
						Bukkit.getScheduler().cancelTask(getTaskId());
						return;
					}
					fw.setVelocity(player.getLocation().getDirection());
				}
			}.runTaskTimer(SCB.getInstance(), 20, 1);
		}
	}

	@Override
	public boolean ShootArrow(Player paramPlayer) {
		return false;
	}

	@Override
	public void Spawn(Player player) {

		ItemStack h = new ItemStack(Material.LEATHER_HELMET);
	    ItemStack c = new ItemStack(Material.LEATHER_CHESTPLATE);
	    ItemStack l = new ItemStack(Material.LEATHER_LEGGINGS);
	    ItemStack b = new ItemStack(Material.LEATHER_BOOTS);
	    LeatherArmorMeta cam = (LeatherArmorMeta)c.getItemMeta();
	    LeatherArmorMeta lam = (LeatherArmorMeta)l.getItemMeta();
	    LeatherArmorMeta bam = (LeatherArmorMeta)b.getItemMeta();
	    LeatherArmorMeta helm = (LeatherArmorMeta)h.getItemMeta();
	    helm.setColor(Color.WHITE);
	    cam.setColor(Color.ORANGE);
	    lam.setColor(Color.WHITE);
	    bam.setColor(Color.ORANGE);
	    c.setItemMeta(cam);
	    l.setItemMeta(lam);
	    b.setItemMeta(bam);
	    h.setItemMeta(helm);
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
	    player.getPlayer().getInventory().setHelmet(h);
	    player.getPlayer().getInventory().setChestplate(c);
	    player.getPlayer().getInventory().setLeggings(l);
	    player.getPlayer().getInventory().setBoots(b);
	    ItemStack i1 = new ItemStack(Material.FIREWORK, 3);
	    ItemStack i2 = new ItemStack(Material.BOW, 1);
	    ItemStack i3 = new ItemStack(Material.ARROW,1);
	    
        ItemMeta im1 = i1.getItemMeta();
        im1.setDisplayName(ChatColor.DARK_PURPLE + "Shoots you up into the sky!");
        ArrayList<String> im3l = new ArrayList<String>();
        im3l.add(ChatColor.DARK_AQUA + "Direction controlable after 1 second!");
        
        im1.setLore(im3l);
        i1.setItemMeta(im1);
        
	    i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 3);
	    i2.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
	    
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1,i2,i3 });
		
	}

	@Override
	public void ThrowPotion(Player paramPlayer1, Player paramPlayer2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "firework";
	}
	public boolean a(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.FIREWORK);
	  }

}
