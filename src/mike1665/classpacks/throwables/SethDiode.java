package mike1665.classpacks.throwables;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class SethDiode
implements EntityHitEvent
{
public boolean onHitByEntity(Entity e, Item i, Player p)
{
  if ((e instanceof LivingEntity)) {
    if ((e instanceof Player))
    {
      Player t = (Player)e;
      double h = p.getHealth();
      double ld = p.getLastDamage();
      if (h > ld) {
        t.setHealth(h - ld);
      } else {
        t.setHealth(0.0D);
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