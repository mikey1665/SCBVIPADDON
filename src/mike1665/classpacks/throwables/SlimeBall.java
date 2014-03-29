package mike1665.classpacks.throwables;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class SlimeBall
implements EntityHitEvent
{
public boolean onHitByEntity(Entity e, Item i, Player p)
{
  if ((e instanceof LivingEntity))
  {
    double x = i.getLocation().getX();
    double y = i.getLocation().getY();
    double z = i.getLocation().getZ();
    i.getLocation().getWorld().createExplosion(x, y, z, 1.5F, false, false);
    return true;
  }
  return false;
}

public boolean onHitByBlock(Item item, Player p)
{
  double x = item.getLocation().getBlockX() + 0.5D;
  double y = item.getLocation().getBlockY() + 0.5D;
  double z = item.getLocation().getBlockZ() + 0.5D;
  item.getLocation().getWorld().createExplosion(x, y, z, 1.5F, false, false);
  return true;
}
}