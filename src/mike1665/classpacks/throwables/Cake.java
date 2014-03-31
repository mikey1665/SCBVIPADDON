package mike1665.classpacks.throwables;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class Cake
implements EntityHitEvent
{
public boolean onHitByEntity(Entity e, Item i, Player p)
{
  if ((e instanceof LivingEntity))
  {
    double x = i.getLocation().getX();
    double y = i.getLocation().getY();
    double z = i.getLocation().getZ();
    i.getLocation().getWorld().createExplosion(x, y, z, 2.0F, false, false);
	World w = p.getWorld();
	w.strikeLightningEffect(i.getLocation());
    return true;
  }
  return false;
}

public boolean onHitByBlock(Item item, Player p)
{
  double x = item.getLocation().getBlockX() + 1.0D;
  double y = item.getLocation().getBlockY() + 1.0D;
  double z = item.getLocation().getBlockZ() + 1.0D;
  item.getLocation().getWorld().createExplosion(x, y, z, 2.0F, false, false);
	World w = p.getWorld();
	w.strikeLightningEffect(item.getLocation());
  return true;
}
}