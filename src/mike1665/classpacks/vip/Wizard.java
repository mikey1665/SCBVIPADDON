package mike1665.classpacks.vip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.util.Vector;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.managers.Game;

public class Wizard implements ClassInterface{
	Random r = new Random();
	public static HashMap<String, Integer> witchJump = new HashMap<String, Integer>();


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
		return ChatColor.DARK_BLUE + "[Wizard] " + ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.STICK);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.GOLD + "Wizard");
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
	public void RightClick(Player player, Action arg1, Block arg2) {
		if(a(player)) {
			player.getInventory().removeItem(new ItemStack(Material.BAKED_POTATO, 1));
			player.getItemInHand().setType(Material.STICK);
			removeOneFromHand(player);
			player.updateInventory();
			
			Random random = new Random();
			  int num = random.nextInt(6 - 1 + 1) + 1;
			  if(num == 6 ) {
				  player.getInventory().removeItem(new ItemStack(Material.BAKED_POTATO, 1));
				  player.getItemInHand().setType(Material.AIR);
					removeOneFromHand(player);
					
				  ItemStack stick = new ItemStack(Material.STICK, 1);
				  ItemStack lightning = new ItemStack(Material.APPLE, 3);
				  
				  stick.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
				  stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 3);
				  
				  ItemMeta im1 = lightning.getItemMeta();
			        im1.setDisplayName(ChatColor.DARK_PURPLE + "Lightning Strike");
			        ArrayList<String> im3l = new ArrayList<String>();
			        im3l.add(ChatColor.YELLOW + "Hits everyone wth lightning");
			        
			        im1.setLore(im3l);
			        lightning.setItemMeta(im1);
			        
			        player.getPlayer().getInventory().addItem(new ItemStack[] { stick,lightning });
			        player.updateInventory();
			        
			        }
			  if(num == 5) {
				  player.getInventory().removeItem(new ItemStack(Material.BAKED_POTATO, 1));
					player.getItemInHand().setType(Material.AIR);
					removeOneFromHand(player);
					
				  ItemStack stick = new ItemStack(Material.STICK, 1);
				  ItemStack fireball = new ItemStack(Material.FIREBALL, 1);
				  
				  stick.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
				  stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
				  
				  ItemMeta im1 = fireball.getItemMeta();
			        im1.setDisplayName(ChatColor.YELLOW + "Fireball");
			        ArrayList<String> im3l = new ArrayList<String>();
			        im3l.add(ChatColor.YELLOW + "Shoots Fireballs");
			        
			        im1.setLore(im3l);
			        fireball.setItemMeta(im1);
			        
			        player.getPlayer().getInventory().addItem(new ItemStack[] { stick, fireball }); 
			        player.updateInventory();
			  }
			  if(num == 4) {
				  player.getInventory().removeItem(new ItemStack(Material.BAKED_POTATO, 1));
					player.getItemInHand().setType(Material.AIR);
					removeOneFromHand(player);
					
				  ItemStack stick = new ItemStack(Material.STICK, 1);
				  ItemStack fireball = new ItemStack(Material.DIAMOND, 1);
				  
				  stick.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
				  stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
				  
				  ItemMeta im1 = fireball.getItemMeta();
			        im1.setDisplayName(ChatColor.YELLOW + "Rising Power");
			        ArrayList<String> im3l = new ArrayList<String>();
			        im3l.add("Use it to jump in the air");
			        im3l.add("up to four times in a row");
			        
			        im1.setLore(im3l);
			        fireball.setItemMeta(im1);
			        
			        player.getPlayer().getInventory().addItem(new ItemStack[] { stick, fireball }); 
			        player.updateInventory();
				  
			  }
			  if(num == 3) {
				  player.getInventory().removeItem(new ItemStack(Material.BAKED_POTATO, 1));
					player.getItemInHand().setType(Material.AIR);
					removeOneFromHand(player);
					
				  ItemStack stick = new ItemStack(Material.STICK, 1);
				  ItemStack fireball = new ItemStack(Material.BEDROCK, 1);
				  
				  stick.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
				  stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
				  
				  ItemMeta im1 = fireball.getItemMeta();
			        im1.setDisplayName(ChatColor.YELLOW + "Blindness");
			        ArrayList<String> im3l = new ArrayList<String>();
			        im3l.add(ChatColor.BLUE + "Throws Blindness Potion");
			        
			        im1.setLore(im3l);
			        fireball.setItemMeta(im1);
			        
			        player.getPlayer().getInventory().addItem(new ItemStack[] { stick, fireball }); 
			        player.updateInventory();
			  }
			  if(num == 2) {
				  player.getInventory().removeItem(new ItemStack(Material.BAKED_POTATO, 1));
					player.getItemInHand().setType(Material.AIR);
					removeOneFromHand(player);
					
				  ItemStack stick = new ItemStack(Material.STICK, 1);
				  ItemStack fireball = new ItemStack(Material.ROTTEN_FLESH, 1);
				  
				  stick.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
				  stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
				  
				  ItemMeta im1 = fireball.getItemMeta();
			        im1.setDisplayName(ChatColor.YELLOW + "Nausea");
			        ArrayList<String> im3l = new ArrayList<String>();
			        im3l.add(ChatColor.YELLOW + "Shoots Nasuea");
			        
			        im1.setLore(im3l);
			        fireball.setItemMeta(im1);
			        
			        player.getPlayer().getInventory().addItem(new ItemStack[] { stick, fireball }); 
			        player.updateInventory();
			  }
			  if(num == 1) {
				  player.getInventory().removeItem(new ItemStack(Material.BAKED_POTATO, 1));
					player.getItemInHand().setType(Material.AIR);
					removeOneFromHand(player);
					
				  ItemStack stick = new ItemStack(Material.STICK, 1);
				  ItemStack fireball = new ItemStack(Material.COMPASS, 1);
				  
				  stick.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
				  stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
				  
				  ItemMeta im1 = fireball.getItemMeta();
			        im1.setDisplayName(ChatColor.YELLOW + "Teleporter");
			        ArrayList<String> im3l = new ArrayList<String>();
			        im3l.add(ChatColor.YELLOW + "Teleport to a random player");
			        
			        im1.setLore(im3l);
			        fireball.setItemMeta(im1);
			        
			        player.getPlayer().getInventory().addItem(new ItemStack[] { stick, fireball }); 
			        player.updateInventory();
			  }
			  player.updateInventory();
		}
		else if (lightning(player)) {
			ItemStack h = player.getItemInHand();
			if (h.getAmount() > 1)
		        h.setAmount(h.getAmount() - 1);
		      else
		        player.getItemInHand().setType(Material.GLASS); 
		        player.getItemInHand().setType(Material.AIR);
			for(Player p: Game.get().getPlys(Game.get().getArena(player))) {
				World w = player.getWorld();
				w.strikeLightningEffect(p.getLocation());
			if(p != player)	p.damage(3.0);
				
			}			
		}
		else if (fireball(player)) {
			player.launchProjectile(Fireball.class);
		}
		else if (rising(player)) {
			Player p = player;
			if (!witchJump.containsKey(p.getName()))
		      {
		        witchJump.put(p.getName(), Integer.valueOf(1));
		        p.setLevel(1);
	            player.setVelocity(player.getLocation().getDirection().multiply(2));
		        p.setVelocity(new Vector(p.getVelocity().getX(), 1.0D, p.getVelocity().getZ()));
		      }
		      else if (((Integer)witchJump.get(p.getName())).intValue() < 4)
		      {
		        if (p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType() != Material.AIR)
		        {
		          witchJump.remove(p.getName());
		          witchJump.put(p.getName(), Integer.valueOf(0));
		        }
	            player.setVelocity(player.getLocation().getDirection().multiply(2));
		        p.setVelocity(new Vector(p.getVelocity().getX(), 1.0D, p.getVelocity().getZ()));
		        int jump = ((Integer)witchJump.get(p.getName())).intValue() + 1;
		        witchJump.put(p.getName(), Integer.valueOf(jump));
		        p.setLevel(jump);
		      }
		      else if (p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType() != Material.AIR)
		      {
		        witchJump.remove(p.getName());
		        witchJump.put(player.getName(), Integer.valueOf(0));
		        player.setVelocity(new Vector(player.getVelocity().getX(), 1.0D, p.getVelocity().getZ()));
		        int jump = ((Integer)witchJump.get(player.getName())).intValue() + 1;
		        witchJump.put(p.getName(), Integer.valueOf(jump));
		        player.setLevel(jump);
		      }
		}
		else if (blindness(player)) {
			  Potion potion = new Potion(PotionType.SLOWNESS, 1).splash();
			  ItemStack itemStack = new ItemStack(Material.POTION);
		      potion.apply(itemStack);
		      PotionMeta meta = (PotionMeta)itemStack.getItemMeta();
		      meta.addCustomEffect(new PotionEffect(PotionEffectType.BLINDNESS, 200, 2), true);
		      itemStack.setItemMeta(meta);
		      ThrownPotion thrownPotion = (ThrownPotion)player.launchProjectile(ThrownPotion.class);
		      thrownPotion.setItem(itemStack);
		}
		else if (nausea(player)) {
			  Potion potion = new Potion(PotionType.SLOWNESS, 1).splash();
			  ItemStack itemStack = new ItemStack(Material.POTION);
		      potion.apply(itemStack);
		      PotionMeta meta = (PotionMeta)itemStack.getItemMeta();
		      meta.addCustomEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 2), true);
		      itemStack.setItemMeta(meta);
		      ThrownPotion thrownPotion = (ThrownPotion)player.launchProjectile(ThrownPotion.class);
		      thrownPotion.setItem(itemStack);
		}
		else if (teleportation(player)) {
			Player t = getTargetPlayer(Game.get().getArena(player), player);
			if (t != null) player.teleport(t);
		}
		else player.sendMessage(ChatColor.RED + "Failed to work.");
	}

	@Override
	public boolean ShootArrow(Player arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Spawn(Player player) {
	    ItemStack i1 = new ItemStack(Material.BAKED_POTATO);
	    
	    ItemMeta im1 = i1.getItemMeta();
        im1.setDisplayName(ChatColor.DARK_PURPLE + "Random Wand");
        ArrayList<String> im3l = new ArrayList<String>();
        im3l.add(ChatColor.RED + "Right-Click for a random wand.");
        
        im1.setLore(im3l);
        i1.setItemMeta(im1);
	    
	    i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
	    
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1 });
	}

	@Override
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "wizard";
	}
	
	public boolean a(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.BAKED_POTATO);
	  }
	public boolean lightning(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.APPLE);
	  }

	public boolean blindness(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.BEDROCK);
	  }

	public boolean teleportation(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.COMPASS);
	  }
	public boolean fireball(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.FIREBALL);
	  }

	public boolean nausea(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.ROTTEN_FLESH);
	  }
	public boolean rising(Player player) {
	    return (player.getItemInHand() != null && player.getItemInHand().getType() == Material.DIAMOND);
	  }
	public void removeOneFromHand(Player player) {
        if(player.getItemInHand() == null) return;
        int amount = player.getItemInHand().getAmount();
        player.getItemInHand().setAmount(amount -1);
        if(amount == 1) player.setItemInHand(null);
    }
	public Player getTargetPlayer(String name, Player... ignore){
        if(Game.get().getPlys(name) != null && Game.get().getPlys(name).length - ignore.length >= 1) {
            Player[] plys = Game.get().getPlys(name);
            List<String> safe = new ArrayList<String>();
            if(ignore.length >= 1) for(Player p : ignore) safe.add(p.getName());
            int i = r.nextInt(plys.length);
            while(safe.contains(plys[i].getName())) {
                i = r.nextInt(plys.length);
            }
            return plys[i];
        }
        return null;
    }
}
