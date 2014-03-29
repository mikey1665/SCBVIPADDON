package mike1665.classpacks.vip;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.managers.Game;

public class Wolf implements ClassInterface{

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
		return ChatColor.GRAY + "[Wolf] " + ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.BONE);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.GRAY + "Wolf Class");
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


	@Override
	public void RightClick(Player player, Action arg1, Block arg2) {
		if (a(player)) {
			player.getItemInHand().setType(Material.AIR);	
			for(Player p: Game.get().getPlys(Game.get().getArena(player))) {
				Wolf wolf = (Wolf) player.getWorld().spawnEntity(player.getLocation(), EntityType.WOLF);
				//wolf.Attack(p, arg1);
			}			
		}
	}

	@Override
	public boolean ShootArrow(Player arg0) {
		// TODO Auto-generated method stub
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
	    cam.setColor(Color.WHITE);
	    lam.setColor(Color.WHITE);
	    bam.setColor(Color.WHITE);
	    helm.setColor(Color.WHITE);
	    
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
	    
	    ItemStack i1 = new ItemStack(Material.BONE, 1);
	    ItemStack i2 = new ItemStack(Material.RAW_BEEF, 1);
	    
	    ItemMeta im1 = i2.getItemMeta();
        im1.setDisplayName(ChatColor.RED + "Double Team");
        ArrayList<String> im3l = new ArrayList<String>();
        im3l.add(ChatColor.YELLOW + "Spawns 2 wolfs to attack other player!");
        
        im1.setLore(im3l);
        i2.setItemMeta(im1);
	    
	    i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
	    
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1,i2 });
		
	}

	@Override
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "wolf";
	}
	public boolean a(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.RAW_BEEF);
	  }

}
