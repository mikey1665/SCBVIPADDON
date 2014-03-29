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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.main.SCB;

public class BabyCow implements ClassInterface{

	@Override
	public void ArrowHit(Player arg0, Entity arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Attack(Player attacker, final Player victim) {
			victim.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, Integer.MAX_VALUE, 1), true);
			new BukkitRunnable() {
				
				@Override
				public void run() {
					if (victim.hasPotionEffect(PotionEffectType.CONFUSION)) victim.removePotionEffect(PotionEffectType.CONFUSION);
				}
			}.runTaskLater(SCB.getInstance(), 20*5);
		}

	@Override
	public void Death(Player arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String DisplayName() {
		return ChatColor.RED + "[Baby Cow] " + ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.MILK_BUCKET);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.RED + "Baby Cow");
	    icon.setItemMeta(im);
	    return icon;
	}

	@Override
	public boolean Jump(Player arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Movement(Player p) {
		return false;
		/*if (p.getGameMode() != GameMode.CREATIVE && PlayerManager.get().ingame(p) == true) {
			 if(p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType() != Material.AIR) {
				 p.setAllowFlight(true);
			 }
		}
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
		return true;*/
	}

	@Override
	public void RightClick(Player arg0, Action arg1, Block arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ShootArrow(Player arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Spawn(Player player) {
		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 8000, 2));		
		PlayerInventory i = player.getInventory();
        i.clear();
	    ItemStack c = new ItemStack(Material.LEATHER_CHESTPLATE);
	    ItemStack l = new ItemStack(Material.LEATHER_LEGGINGS);
	    ItemStack b = new ItemStack(Material.LEATHER_BOOTS);
	    
	    LeatherArmorMeta cam = (LeatherArmorMeta)c.getItemMeta();
	    LeatherArmorMeta lam = (LeatherArmorMeta)l.getItemMeta();
	    LeatherArmorMeta bam = (LeatherArmorMeta)b.getItemMeta();
	    
        i.setHelmet(new mike1665.classpacks.utils.HeadCreator().getPlayerhead("MHF_MushroomCow", ChatColor.DARK_GRAY + "Baby Cow head"));
	    cam.setColor(Color.RED);
	    lam.setColor(Color.WHITE);
	    bam.setColor(Color.RED);
	    
	    c.setItemMeta(cam);
	    l.setItemMeta(lam);
	    b.setItemMeta(bam);
	    
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
	    
	    player.getPlayer().getInventory().setChestplate(c);
	    player.getPlayer().getInventory().setLeggings(l);
	    player.getPlayer().getInventory().setBoots(b);
	    
	    ItemStack i1 = new ItemStack(Material.RED_MUSHROOM, 1);
	    ItemStack i2 = new ItemStack(Material.MILK_BUCKET);

	    i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
	    i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
	    
	    ItemMeta im1 = i1.getItemMeta();
        im1.setDisplayName(ChatColor.RED + "Mushroom of Nausuea");
        ArrayList<String> im3l = new ArrayList<String>();
        im3l.add(ChatColor.DARK_AQUA + "Gives people nausea for 5 seconds!");
        
        im1.setLore(im3l);
        i1.setItemMeta(im1);
	    
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1 });
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i2 });
	    player.getPlayer().getInventory().setItem(0, i1);
	    player.getPlayer().getInventory().setItem(1, i2);
	}

	@Override
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "babycow";
	}

}
