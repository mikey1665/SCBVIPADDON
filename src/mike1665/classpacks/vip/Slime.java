package mike1665.classpacks.vip;

import mike1665.classpacks.throwables.ThrowItem;
import mike1665.classpacks.throwables.ThrowReason;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.util.Vector;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.main.SCB;

public class Slime implements ClassInterface{

	@Override
	public void ArrowHit(Player arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Attack(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BlockPlace(Player arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Death(Player arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String DisplayName() {
		return ChatColor.GREEN + "Slime";
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.SLIME_BALL);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.GREEN + "Slime");
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
	public void ShootArrow(Player arg0) {
		// TODO Auto-generated method stub
		
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
	    hsm.setOwner("Siffran123");
	    cam.setColor(Color.GREEN);
	    lam.setColor(Color.GREEN);
	    bam.setColor(Color.GREEN);
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
	    ItemStack i1 = new ItemStack(Material.STONE_SWORD, 1);
	    ItemStack i2 = new ItemStack(Material.SLIME_BALL, 10);
	    ItemStack i3 = new ItemStack(Material.MONSTER_EGG, 1, (short)55);
	    i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
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
		return "slime";
	}

	@Override
	public void RightClick(Player player) {
		if (a(player))
	    {
	      ItemStack i = new ItemStack(Material.SLIME_BALL);
	      ThrowReason a = ThrowReason.SLIMEBALL;
	      Location l = player.getEyeLocation();
	      Vector v = player.getLocation().getDirection().multiply(2.5D);
	      ItemStack h = player.getItemInHand();
	      new ThrowItem(SCB.getInstance(), i, a, player, l, v, true, true);
	      if (h.getAmount() > 1)
	        h.setAmount(h.getAmount() - 1);
	      else
	        player.getInventory().remove(h);
	    }
	}
	public boolean a(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.SLIME_BALL);
	  }

}
