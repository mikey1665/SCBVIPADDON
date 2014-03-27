package mike1665.classpacks.main;

import mike1665.classpacks.vip.Ghast;
import mike1665.classpacks.vip.IronGolem;
import mike1665.classpacks.vip.MagmaCube;
import mike1665.classpacks.vip.Slime;

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
  }

  public void onDisable()
  {
  }
}