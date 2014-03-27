package mike1665.classpacks.throwables;


public enum ThrowReason
{
  SLIMEBALL(new SlimeBall()),
  GOLDBLOCK(new GoldBlock());

  private EntityHitEvent e;

  private ThrowReason(EntityHitEvent e) {
    this.e = e;
  }

  public EntityHitEvent getEvent()
  {
    return this.e;
  }
}