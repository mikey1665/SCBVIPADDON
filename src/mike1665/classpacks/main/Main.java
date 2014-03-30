package mike1665.classpacks.main;

import mike1665.classpacks.vip.BabyCow;
import mike1665.classpacks.vip.Bat;
import mike1665.classpacks.vip.Bedrock;
import mike1665.classpacks.vip.BudderGolem;
import mike1665.classpacks.vip.EnderDragon;
import mike1665.classpacks.vip.Firework;
import mike1665.classpacks.vip.Ghast;
import mike1665.classpacks.vip.Herobrine;
import mike1665.classpacks.vip.IronGolem;
import mike1665.classpacks.vip.MagmaCube;
import mike1665.classpacks.vip.Slime;
import mike1665.classpacks.vip.Wizard;
import mike1665.classpacks.vip.Wolf;

import org.bukkit.plugin.java.JavaPlugin;

import Pauldg7.plugins.SCB.managers.ClassManager;

public class Main extends JavaPlugin
{
  public void onEnable()
  {
    ClassManager.get().addVipClass("slime", new Slime());
    ClassManager.get().addVipClass("irongolem", new IronGolem());
    ClassManager.get().addVipClass("magmacube", new MagmaCube());
    ClassManager.get().addVipClass("ghast", new Ghast());
    ClassManager.get().addVipClass("babycow", new BabyCow());
    ClassManager.get().addVipClass("bat", new Bat());
    ClassManager.get().addVipClass("buddergolem", new BudderGolem());
    ClassManager.get().addVipClass("bedrock", new Bedrock());
    ClassManager.get().addVipClass("enderdagon", new EnderDragon());
    ClassManager.get().addVipClass("firework", new Firework());
    ClassManager.get().addVipClass("wolf", new Wolf());
    ClassManager.get().addVipClass("herbrobe", new Herobrine());
    ClassManager.get().addVipClass("wizard", new Wizard());
  }

  public void onDisable()
  {
  }
}