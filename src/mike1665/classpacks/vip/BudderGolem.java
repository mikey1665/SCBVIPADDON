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
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.util.Vector;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.main.SCB;

public class BudderGolem implements ClassInterface{

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
		return ChatColor.YELLOW + "Budder Golem";
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.GOLD_BLOCK);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.BLACK + "Budder Golem");
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
	
    Player p;
	@Override
	public void RightClick(Player player, Action arg1, Block arg2) {
		if (a(player))
	    {
	      ItemStack i = new ItemStack(Material.GOLD_BLOCK);
	      ThrowReason a = ThrowReason.GOLDBLOCK;
	      Location l = player.getEyeLocation();
	      Vector v = player.getLocation().getDirection().multiply(1.5D);
	      ItemStack h = player.getItemInHand();
	      new ThrowItem(SCB.getInstance(), i, a, player, l, v, true, true);
	      if (h.getAmount() > 1)
	        h.setAmount(h.getAmount() - 1);
	      else
	        player.getInventory().remove(h);
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
        ItemStack h = new ItemStack(Material.LEATHER_HELMET);
	    ItemStack c = new ItemStack(Material.LEATHER_CHESTPLATE);
	    ItemStack l = new ItemStack(Material.LEATHER_LEGGINGS);
	    ItemStack b = new ItemStack(Material.LEATHER_BOOTS);
	    
	    LeatherArmorMeta helm = (LeatherArmorMeta)h.getItemMeta();
	    LeatherArmorMeta cam = (LeatherArmorMeta)c.getItemMeta();
	    LeatherArmorMeta lam = (LeatherArmorMeta)l.getItemMeta();
	    LeatherArmorMeta bam = (LeatherArmorMeta)b.getItemMeta();
	    
	    helm.setColor(Color.YELLOW);
	    cam.setColor(Color.YELLOW);
	    lam.setColor(Color.YELLOW);
	    bam.setColor(Color.YELLOW);
	    
	    h.setItemMeta(helm);
	    c.setItemMeta(cam);
	    l.setItemMeta(lam);
	    b.setItemMeta(bam);
	    
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
	    
	    player.getPlayer().getInventory().setHelmet(h);
	    player.getPlayer().getInventory().setChestplate(c);
	    player.getPlayer().getInventory().setLeggings(l);
	    player.getPlayer().getInventory().setBoots(b);
	    
	    ItemStack i1 = new ItemStack(Material.GOLD_AXE);
	    ItemStack i2 = new ItemStack(Material.GOLD_BLOCK, 10);

	    i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
	    i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 3);
	    
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i2} );
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1 });
	    player.getPlayer().getInventory().setItem(1, i2);
	    player.getPlayer().getInventory().setItem(0, i1);
	}

	@Override
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "buddergolem";
	}
	public boolean a(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.GOLD_BLOCK);
	  }

}
