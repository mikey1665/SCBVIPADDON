package mike1665.classpacks.throwables;


public enum ThrowReason
{
  SLIMEBALL(new SlimeBall());

  private EntityHitEvent e;

  private ThrowReason(EntityHitEvent e) {
    this.e = e;
  }

  public EntityHitEvent getEvent()
  {
    return this.e;
  }
}