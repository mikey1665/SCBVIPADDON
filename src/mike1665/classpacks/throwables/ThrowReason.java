package mike1665.classpacks.throwables;

public enum ThrowReason
{
  DWELLER(new DwellerBone()), 
  SPAWNEGG(new Spawnegg()), 
  TNT(new TNT()), 
  SETHDIODE(new SethDiode()), 
  SETHCOMPARATOR(new SethComparator()), 
  SETHREDSTONE(new SethRedstone()), 
  SLIMEBALL(new SlimeBall()), 
  SLIMEEGG(new SlimeEgg());

  private EntityHitEvent e;

  private ThrowReason(EntityHitEvent e) {
    this.e = e;
  }

  public EntityHitEvent getEvent()
  {
    return this.e;
  }
}