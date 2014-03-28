package mike1665.classpacks.vip;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.material.SpawnEgg;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;

public class Bat implements ClassInterface{

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
		return ChatColor.BLACK + "Bat";
	}

	@Override
	public ItemStack Icon() {
		SpawnEgg egg = new SpawnEgg(EntityType.BAT);
		ItemStack icon = egg.toItemStack(1);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.RED + "Bat");
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
	public void RightClick(Player arg0, Action arg1, Block arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ShootArrow(Player arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void Spawn(Player player) {
		
		player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 8000, 5));		
		player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 8000, 4));
		
		PlayerInventory i = player.getInventory();
        i.clear();
     ///   ItemStack h = new ItemStack(Material.LEATHER_HELMET);
	  ///  ItemStack c = new ItemStack(Material.LEATHER_CHESTPLATE);
	   /// ItemStack l = new ItemStack(Material.LEATHER_LEGGINGS);
	    ItemStack b = new ItemStack(Material.LEATHER_BOOTS);
	    
	    ///LeatherArmorMeta helm = (LeatherArmorMeta)h.getItemMeta();
	   /// LeatherArmorMeta cam = (LeatherArmorMeta)c.getItemMeta();
	   /// LeatherArmorMeta lam = (LeatherArmorMeta)l.getItemMeta();
	    LeatherArmorMeta bam = (LeatherArmorMeta)b.getItemMeta();
	    
	   /// helm.setColor(Color.BLACK);
	   /// cam.setColor(Color.BLACK);
	   // lam.setColor(Color.BLACK);
	    bam.setColor(Color.BLACK);
	    
	   //// h.setItemMeta(helm);
	   // c.setItemMeta(cam);
	   // l.setItemMeta(lam);
	    b.setItemMeta(bam);
	    
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
	    
	   // player.getPlayer().getInventory().setHelmet(h);
	   // player.getPlayer().getInventory().setChestplate(c);
	   // player.getPlayer().getInventory().setLeggings(l);
	    player.getPlayer().getInventory().setBoots(b);
	    
	    ItemStack i1 = new ItemStack(Material.SHEARS);

	    i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
	    
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1 });
	    player.getPlayer().getInventory().setItem(0, i1);
	    player.updateInventory();
	}

	@Override
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "bat";
	}

}
