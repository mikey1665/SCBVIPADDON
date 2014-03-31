package mike1665.classpacks.vip;

import java.util.ArrayList;

import mike1665.classpacks.throwables.ThrowItem;
import mike1665.classpacks.throwables.ThrowReason;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.util.Vector;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.main.SCB;

public class Cake implements ClassInterface{

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
		return ChatColor.LIGHT_PURPLE + "[Cake] " + ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.CAKE);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.DARK_RED + "Cake");
	    ArrayList<String> lore = new ArrayList<String>();
	    lore.add(ChatColor.YELLOW + "Cake cake cake");
	    im.setLore(lore);
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
		if (a(player))
	    {
	      ItemStack i = new ItemStack(Material.CAKE);
	      ThrowReason a = ThrowReason.CAKE;
	      Location l = player.getEyeLocation();
	      Vector v = player.getLocation().getDirection().multiply(2.50);
	      ItemStack h = player.getItemInHand();
	      new ThrowItem(SCB.getInstance(), i, a, player, l, v, true, true);
	      if (h.getAmount() > 1)
	        h.setAmount(h.getAmount() - 1);
	      else
	        player.getInventory().remove(h);
	    }
		if (b(player)) {
			org.bukkit.entity.Egg egg = (org.bukkit.entity.Egg) player.getWorld().spawnEntity(player.getLocation(), EntityType.EGG);
			player.teleport(egg.getLocation());
			World w = player.getWorld();
			w.strikeLightningEffect(egg.getLocation());
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
	    cam.setColor(Color.PURPLE);
	    lam.setColor(Color.PURPLE);
	    bam.setColor(Color.PURPLE);
	    helm.setColor(Color.PURPLE);
	    
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
	    
	    ItemStack i1 = new ItemStack(Material.WOOD_SWORD, 1);
	    ItemStack i2 = new ItemStack(Material.CAKE, 5);
	    ItemStack i3 = new ItemStack(Material.EGG, 1);
	    
	    i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
	    
	    ItemMeta im1 = i2.getItemMeta();
        im1.setDisplayName(ChatColor.RED + "Cake Bomb");
        ArrayList<String> im3l = new ArrayList<String>();
        im3l.add(ChatColor.YELLOW + "Huge bomb");
        
        im1.setLore(im3l);
        i2.setItemMeta(im1);
	    
	    i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
	    
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1,i2,i3 });
	}

	@Override
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "cake";
	}
	public boolean a(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.CAKE);
	  }
	public boolean b(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.EGG);
	  }

}
