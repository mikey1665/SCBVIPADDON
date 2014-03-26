package mike1665.classpacks.throwables;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

public abstract interface EntityHitEvent
{
  public abstract boolean onHitByEntity(Entity paramEntity, Item paramItem, Player paramPlayer);

  public abstract boolean onHitByBlock(Item paramItem, Player paramPlayer);
}