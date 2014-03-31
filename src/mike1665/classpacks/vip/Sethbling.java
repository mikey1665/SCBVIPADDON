package mike1665.classpacks.vip;

import mike1665.classpacks.throwables.ThrowItem;
import mike1665.classpacks.throwables.ThrowReason;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.util.Vector;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.main.SCB;

public class Sethbling implements ClassInterface{

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
		return ChatColor.RED + "[SethBling] " + ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.REDSTONE);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.DARK_RED + "Sethbling");
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
		if (c(player))
	    {
	      ItemStack i = new ItemStack(Material.DIODE);
	      ThrowReason a = ThrowReason.SETHDIODE;
	      Player p = player;
	      Location l = p.getEyeLocation();
	      Vector v = p.getLocation().getDirection().multiply(2.5D);
	      new ThrowItem(SCB.getInstance(), i, a, p, l, v, true, true);
	      if (p.getItemInHand().getAmount() > 1) {
	        p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
	      } else {
	        p.getPlayer().getInventory().remove(p.getItemInHand());
	      }
	    }
		if (b(player))
	    {
	      ItemStack i = new ItemStack(Material.REDSTONE_COMPARATOR);
	      ThrowReason a = ThrowReason.SETHCOMPARATOR;
	      Player p = player;
	      Location l = p.getEyeLocation();
	      Vector v = p.getLocation().getDirection().multiply(2.5D);
	      new ThrowItem(SCB.getInstance(), i, a, p, l, v, true, true);
	      if (p.getItemInHand().getAmount() > 1) {
	        p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
	      } else {
	        p.getPlayer().getInventory().remove(p.getItemInHand());
	      }
	    }
		if (a(player))
	    {
	      ItemStack i = new ItemStack(Material.REDSTONE);
	      ThrowReason a = ThrowReason.SETHREDSTONE;
	      Player p = player;
	      Location l = p.getEyeLocation();
	      Vector v = p.getLocation().getDirection().multiply(2.5D);
	      new ThrowItem(SCB.getInstance(), i, a, p, l, v, false, true);
	      if (p.getItemInHand().getAmount() > 1) {
	        p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
	      } else {
	        p.getPlayer().getInventory().remove(p.getItemInHand());
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
		ItemStack h = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
	    ItemStack c = new ItemStack(Material.LEATHER_CHESTPLATE);
	    ItemStack l = new ItemStack(Material.LEATHER_LEGGINGS);
	    ItemStack b = new ItemStack(Material.LEATHER_BOOTS);
	    
	    LeatherArmorMeta cam = (LeatherArmorMeta)c.getItemMeta();
	    LeatherArmorMeta lam = (LeatherArmorMeta)l.getItemMeta();
	    LeatherArmorMeta bam = (LeatherArmorMeta)b.getItemMeta();
	    SkullMeta hsm = (SkullMeta)h.getItemMeta();
	    
	    hsm.setOwner("SethBling");
	    cam.setColor(Color.RED);
	    lam.setColor(Color.RED);
	    bam.setColor(Color.RED);
	    c.setItemMeta(cam);
	    l.setItemMeta(lam);
	    b.setItemMeta(bam);
	    h.setItemMeta(hsm);
	    

	    b.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
	    
	    player.getPlayer().getInventory().setHelmet(h);
	    player.getPlayer().getInventory().setChestplate(c);
	    player.getPlayer().getInventory().setLeggings(l);
	    player.getPlayer().getInventory().setBoots(b);
	    


	    ItemStack i1 = new ItemStack(Material.REDSTONE, 10);
	    ItemStack i2 = new ItemStack(Material.DIODE, 5);
	    ItemStack i3 = new ItemStack(Material.REDSTONE_COMPARATOR, 5);
	    
	    i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
	    i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
	    
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1 });
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i2 });
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i3 });
	}

	@Override
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "sethbling";
	}
	public boolean a(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.REDSTONE);
	  }
	public boolean b(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.REDSTONE_COMPARATOR);
	  }

	public boolean c(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.DIODE);
	  }

}
