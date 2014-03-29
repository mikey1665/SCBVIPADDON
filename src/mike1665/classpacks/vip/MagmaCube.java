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
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;

public class MagmaCube implements ClassInterface{

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
		return ChatColor.RED + "[MagmaCube]" + ChatColor.RESET;
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.MAGMA_CREAM);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.RED + "Magma Cube");
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
	public void Spawn(Player player) {

		PlayerInventory i = player.getInventory();
        i.clear();
	    ItemStack c = new ItemStack(Material.LEATHER_CHESTPLATE);
	    ItemStack l = new ItemStack(Material.LEATHER_LEGGINGS);
	    ItemStack b = new ItemStack(Material.LEATHER_BOOTS);
	    
	    LeatherArmorMeta cam = (LeatherArmorMeta)c.getItemMeta();
	    LeatherArmorMeta lam = (LeatherArmorMeta)l.getItemMeta();
	    LeatherArmorMeta bam = (LeatherArmorMeta)b.getItemMeta();
	    
        i.setHelmet(new mike1665.classpacks.utils.HeadCreator().getPlayerhead("MHF_LavaSlime", ChatColor.DARK_GRAY + "MagmaCube"));
	    cam.setColor(Color.GREEN);
	    lam.setColor(Color.GREEN);
	    bam.setColor(Color.GREEN);
	    
	    c.setItemMeta(cam);
	    l.setItemMeta(lam);
	    b.setItemMeta(bam);
	    
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
	    b.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
	    
	    player.getPlayer().getInventory().setChestplate(c);
	    player.getPlayer().getInventory().setLeggings(l);
	    player.getPlayer().getInventory().setBoots(b);
	    
	    ItemStack i1 = new ItemStack(Material.STONE_SWORD, 1);

	    i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
	    i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
	    
	    player.getPlayer().getInventory().addItem(new ItemStack[] { i1 });
	    player.getPlayer().getInventory().setItem(0, i1);
	}

	@Override
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "magmacube";
	}

}
