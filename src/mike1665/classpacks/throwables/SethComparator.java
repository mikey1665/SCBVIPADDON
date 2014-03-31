package mike1665.classpacks.throwables;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class SethComparator
implements EntityHitEvent
{
public boolean onHitByEntity(Entity e, Item i, Player p)
{
  if ((e instanceof LivingEntity)) {
    if ((e instanceof Player))
    {
      Player victim = (Player)e;
      double vh = victim.getHealth();
      double ph = ((Double)ThrowItem.getShooterHealth().get(Integer.valueOf(i.getEntityId()))).doubleValue();
      if (ph > vh)
      {
        double nh = ph - vh;
        if (nh < vh) {
          victim.setHealth(vh - nh);
        } else {
          victim.setHealth(0.0D);
        }
      }
      else
      {
        double nh = vh - ph;
        if (nh > vh) {
          victim.setHealth(vh + nh);
        } else {
          victim.setHealth(20.0D);
        }
      }
      return true;
    }
  }
  return false;
}

public boolean onHitByBlock(Item item, Player p)
{
  return false;
}
}
