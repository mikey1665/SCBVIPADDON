package mike1665.classpacks.vip;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.main.SCB;
import Pauldg7.plugins.SCB.managers.Game;

public class Herobrine implements ClassInterface{
	
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
		return ChatColor.DARK_AQUA + "[HeroBrine]" + ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.DIAMOND_SWORD);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.DARK_AQUA + "Herobrine");
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
	public void RightClick(final Player player, Action arg1, Block arg2) {
		if (a(player)) {
			Random random = new Random();
			  int num = random.nextInt(3 - 1 + 1) + 1;
			  if(num == 3 ) {
				  for(Player p: Game.get().getPlys(Game.get().getArena(player))) {
					  //World world = p.getWorld();
					  //world.strikeLightning(p.getLocation());
					  p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, Integer.MAX_VALUE, 2));
					  new BukkitRunnable() {
						
						@Override
						public void run() {
							for(Player p: Game.get().getPlys(Game.get().getArena(player))) {
								if(p.hasPotionEffect(PotionEffectType.POISON)) p.removePotionEffect(PotionEffectType.POISON);	 
							}
						}
					}.runTaskLater(SCB.getInstance(), 20*10);
				  }				  
			  }
			  if(num == 2) {
				  for(Player p: Game.get().getPlys(Game.get().getArena(player))) {
					 p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Integer.MAX_VALUE , 2));
					 new BukkitRunnable() {
						
						@Override
						public void run() {
							for(Player p: Game.get().getPlys(Game.get().getArena(player))) {
								if(p.hasPotionEffect(PotionEffectType.BLINDNESS)) p.removePotionEffect(PotionEffectType.BLINDNESS);	 
							}
						}
					}.runTaskLater(SCB.getInstance(), 20*10);
				  }
			  }
			  if (num == 1) {
				  for(Player p: Game.get().getPlys(Game.get().getArena(player))) {
					  p.addPotionEffect(new PotionEffect (PotionEffectType.CONFUSION, Integer.MAX_VALUE, 2));
					  new BukkitRunnable() {
						
						@Override
						public void run() {
							  for(Player p: Game.get().getPlys(Game.get().getArena(player))) {
									if(p.hasPotionEffect(PotionEffectType.CONFUSION)) p.removePotionEffect(PotionEffectType.CONFUSION);	  
							  }
						}
					}.runTaskLater(SCB.getInstance(), 20*10);
				  }
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
	    
	    ItemStack i1 = new ItemStack(Material.GOLD_SWORD);
	    ItemStack i2 = new ItemStack(Material.POTION, 2, (short)8270);
	    ItemStack i3 = new ItemStack(Material.DIAMOND_BLOCK, 1);
	    
	    ItemMeta im1 = i3.getItemMeta();
        im1.setDisplayName(ChatColor.RED + "Diamond of Dispair");
        ArrayList<String> im3l = new ArrayList<String>();
        im3l.add(ChatColor.YELLOW + "Random Effects");
        
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
		return "herobrine";
	}
	public boolean a(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.DIAMOND_BLOCK);
	  }

}
