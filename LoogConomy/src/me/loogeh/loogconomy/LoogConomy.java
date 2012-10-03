package me.loogeh.loogconomy;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LoogConomy extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static LoogConomy plugin;
	public Commands cmd;

	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + "has been disabled");
		
		saveConfig();
	}
	
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " has been enabled");
	
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new PlayerListener (this), this);
		
		cmd = new Commands();
		getCommand("money").setExecutor(cmd);
	}
}
