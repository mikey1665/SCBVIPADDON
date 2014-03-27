package mike1665.classpacks.vip;

import mike1665.classpacks.utils.Colorizer;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import Pauldg7.plugins.SCB.interfaces.ClassInterface;

public class Ghast implements ClassInterface{

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
		return ChatColor.DARK_GRAY + "Ghast";
	}

	@Override
	public ItemStack Icon() {
		ItemStack icon = new ItemStack(Material.GHAST_TEAR);
	    ItemMeta im = icon.getItemMeta();
	    im.setDisplayName(ChatColor.GREEN + "Ghast");
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
	public void ThrowPotion(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		return "ghast";
	}

	@Override
	public void Spawn(Player player) {
        PlayerInventory i = player.getInventory();
        i.clear();

        i.setHelmet(new mike1665.classpacks.utils.HeadCreator().getPlayerhead("MHF_Ghast", ChatColor.DARK_GRAY + "Ghast Head"));

        ItemStack chest = Colorizer.setColor(new ItemStack(Material.LEATHER_CHESTPLATE), 250, 250, 250);
        chest.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 10);
        i.setChestplate(chest);

        ItemStack legs = Colorizer.setColor(new ItemStack(Material.LEATHER_LEGGINGS), 250, 250, 250);
        legs.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        i.setLeggings(legs);

        ItemStack boot = Colorizer.setColor(new ItemStack(Material.LEATHER_BOOTS), 250, 250, 250);
        boot.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
        i.setBoots(boot);


        ItemStack i0 = new ItemStack(Material.BOW, 1);
        ItemStack i1 = new ItemStack(Material.GHAST_TEAR, 64);
        ItemStack i2 = new ItemStack(Material.ARROW);
        i0.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 2);
        i0.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 2);
        i1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
        i1.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
        i.addItem(i0);
        i.addItem(i1);
        i.addItem(i2);

	}

	@Override
	public boolean ShootArrow(Player arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
