package mike1665.classpacks.throwables;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

public class SethRedstone
implements EntityHitEvent
{
public boolean onHitByEntity(Entity e, Item i, Player p)
{
  double x = i.getLocation().getX();
  double y = i.getLocation().getY();
  double z = i.getLocation().getZ();
  i.getWorld().createExplosion(x, y, z, 1.0F, false, false);
  return true;
}

public boolean onHitByBlock(Item item, Player p)
{
  return false;
}
}