package mike1665.classpacks.throwables;


public enum ThrowReason
{
  SLIMEBALL(new SlimeBall()),
  GOLDBLOCK(new GoldBlock()),
  SETHDIODE(new SethDiode()),
  SETHREDSTONE(new SethRedstone()),
  SETHCOMPARATOR(new SethComparator()),
  CAKE(new Cake());

  private EntityHitEvent e;

  private ThrowReason(EntityHitEvent e) {
    this.e = e;
  }

  public EntityHitEvent getEvent()
  {
    return this.e;
  }
}