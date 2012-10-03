package me.loogeh.loogconomy;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener{
	public static LoogConomy plugin;
	
	public PlayerListener(LoogConomy instance) {
		plugin = instance;
	}
	
	@EventHandler
	public void join(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if(plugin.getConfig().contains(player.getName().toString())) {
			return;
		} else if(!plugin.getConfig().contains(player.getName().toString())) {
			plugin.getConfig().createSection(player.getName().toString());
			plugin.getConfig().set(player.getName(), Integer.valueOf(0));
		}
	}

}
