package mike1665.classpacks.vip;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.main.SCB;

public class Bedrock implements ClassInterface{

	@Override
	public void ArrowHit(Player arg0, Entity arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Attack(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Death(Player arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String DisplayName() {
		return ChatColor.BLACK + "[Bedrock] " + ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.BEDROCK);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.DARK_GRAY + "Bedrock");
	    icon.setItemMeta(im);
	    return icon;
	}

	@Override
	public boolean Jump(Player arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Movement(Player arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void RightClick(final Player player, Action arg1, Block arg2) {
		if (b(player)) {
				   player.getInventory().removeItem(new ItemStack(Material.BEDROCK, 1));
				   player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 2), true);
				   player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 9), true);
				   player.getItemInHand().setType(Material.WOOD_SWORD);
				   player.updateInventory();
				   
				   new BukkitRunnable() {
					
					@Override
					public void run() {
						if (player.hasPotionEffect(PotionEffectType.SLOW))player.removePotionEffect(PotionEffectType.SLOW);
						if (player.hasPotionEffect(PotionEffectType.DAMAGE_RESISTANCE))player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
					}
				}.runTaskLater(SCB.getInstance(), 20*15);
				  }
			}

	@Override
	public boolean ShootArrow(Player arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Spawn(Player player) {

		PlayerInventory i = player.getInventory();
        i.clear();
        ItemStack h = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
	    ItemStack c = new ItemStack(Material.LEATHER_CHESTPLATE);
	    ItemStack l = new ItemStack(Material.LEATHER_LEGGINGS);
	    ItemStack b = new ItemStack(Material.LEATHER_BOOTS);
	    
	    LeatherArmorMeta cam = (LeatherArmorMeta)c.getItemMeta();
	    LeatherArmorMeta lam = (LeatherArmorMeta)l.getItemMeta();
	    LeatherArmorMeta bam = (LeatherArmorMeta)b.getItemMeta();
	    
	    SkullMeta hsm = (SkullMeta)h.getItemMeta();
	    hsm.setOwner("scraftbrothers5");
	    
	    cam.setColor(Color.BLACK);
	    lam.setColor(Color.BLACK);
	    bam.setColor(Color.BLACK);
	    
	    c.setItemMeta(cam);
	    l.setItemMeta(lam);
	    b.setItemMeta(bam);
	    
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
	    
	    player.getPlayer().getInventory().setHelmet(h);
	    player.getPlayer().getInventory().setChestplate(c);
	    player.getPlayer().getInventory().setLeggings(l);
	    player.getPlayer().getInventory().setBoots(b);
	    
	    ItemStack i1 = new ItemStack(Material.BEDROCK);

	    i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
	    i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
	    
	    ItemMeta im1 = i1.getItemMeta();
        im1.setDisplayName(ChatColor.DARK_AQUA + "Super Bedrock *read the lore*");
        ArrayList<String> im3l = new ArrayList<String>();
        im3l.add(ChatColor.DARK_AQUA + "Be god for 15 secs with slowness!");
        
        im1.setLore(im3l);
        i1.setItemMeta(im1);
	    
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1 });
	    player.getPlayer().getInventory().setItem(0, i1);
	}

	@Override
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "bedrock";
	}
	public boolean b(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.BEDROCK);
	  }

}
