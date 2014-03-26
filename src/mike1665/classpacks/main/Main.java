package mike1665.classpacks.main;

import mike1665.classpacks.vip.Slime;

import org.bukkit.plugin.java.JavaPlugin;

import Pauldg7.plugins.SCB.managers.ClassManager;

public class Main extends JavaPlugin
{
  public void onEnable()
  {
    ClassManager.get().addClasse("slime", new Slime());
  }

  public void onDisable()
  {
  }
}