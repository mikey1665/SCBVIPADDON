package mike1665.classpacks.vip;

import org.bukkit.ChatColor;
import org.bukkit.Color;
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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;
import Pauldg7.plugins.SCB.main.SCB;

public class EnderDragon implements ClassInterface{

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
	}

	@Override
	public String DisplayName() {
		return ChatColor.DARK_PURPLE + "[Ender Dragon] "+ ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.DRAGON_EGG);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.DARK_PURPLE + "Ender Dragon");
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

	@Override
	public void Spawn(final Player player) {
		ItemStack h = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
	    ItemStack c = new ItemStack(Material.LEATHER_CHESTPLATE);
	    ItemStack l = new ItemStack(Material.LEATHER_LEGGINGS);
	    ItemStack b = new ItemStack(Material.LEATHER_BOOTS);
	    LeatherArmorMeta cam = (LeatherArmorMeta)c.getItemMeta();
	    LeatherArmorMeta lam = (LeatherArmorMeta)l.getItemMeta();
	    LeatherArmorMeta bam = (LeatherArmorMeta)b.getItemMeta();
	    SkullMeta hsm = (SkullMeta)h.getItemMeta();
	    hsm.setOwner("KingEndermen");
	    cam.setColor(Color.BLACK);
	    lam.setColor(Color.BLACK);
	    bam.setColor(Color.BLACK);
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
	    ItemStack i2 = new ItemStack(Material.ENDER_PEARL, 5);
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1,i2 });
	    BukkitRunnable br = new BukkitRunnable()
	    {
	      public void run()
	      {
	        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 2000, 2));
	      }
	    };
	    br.runTaskLater(SCB.getInstance(), 80L);
	}

	@Override
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "enderdragon";
	}

}
