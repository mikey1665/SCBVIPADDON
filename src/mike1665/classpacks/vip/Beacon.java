package mike1665.classpacks.vip;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.managers.Game;

public class Beacon implements ClassInterface{

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
		return ChatColor.AQUA + "[Beacon] " + ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.BEACON);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.AQUA + "Beacon");
	    ArrayList<String> lore = new ArrayList<String>();
	    lore.add(ChatColor.YELLOW + "When placed a beacon");
	    lore.add(ChatColor.YELLOW + "Everyone gets lightning but you.");
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
		if (a(player)) {
		     ItemStack h = player.getItemInHand();
		     if (h.getAmount() > 1)
			        h.setAmount(h.getAmount() - 1);
		     else
			    	player.getPlayer().getInventory().remove(player.getItemInHand());
			for(Player p: Game.get().getPlys(Game.get().getArena(player))) {
				p.sendMessage(ChatColor.GREEN +"The power of the mighty beacon has been used!");
				World w = player.getWorld();
				w.strikeLightningEffect(p.getLocation());
			if(p != player)	p.damage(3.0);
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 200, 2));
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
	    cam.setColor(Color.YELLOW);
	    lam.setColor(Color.AQUA);
	    bam.setColor(Color.YELLOW);
	    helm.setColor(Color.AQUA);
	    
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
	    ItemStack i2 = new ItemStack(Material.BEACON, 3);
	    
	    i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 3);
	    
	    ItemMeta im1 = i2.getItemMeta();
        im1.setDisplayName(ChatColor.RED + "POWER OF BEACON");
        ArrayList<String> im3l = new ArrayList<String>();
        im3l.add(ChatColor.YELLOW + "Let it rise");
        
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
		return "beacon";
	}

	public boolean a(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.BEACON);
	  }

}
