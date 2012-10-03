package me.loogeh.loogconomy;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{
	public static LoogConomy plugin;
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(label.equalsIgnoreCase("money")) {
			player.sendMessage(ChatColor.AQUA + "Money: " + ChatColor.WHITE + plugin.getConfig().getInt(player.getName().toString()));
		}
		return false;
	}
	

}
