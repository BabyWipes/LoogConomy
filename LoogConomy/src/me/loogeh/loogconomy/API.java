package me.loogeh.loogconomy;

import org.bukkit.entity.Player;

public class API {
	public static LoogConomy plugin;
	
	public static void subtractMoney(Player player, int i) {
		plugin.getConfig().set(player.getName(), plugin.getConfig().getInt(player.getName()) - i);
	
	}
	
	
	public static void grantMoney(Player player, int i) {
		plugin.getConfig().set(player.getName(), plugin.getConfig().getInt(player.getName()) + i);
	
	}
	
	
	public static int getMoney(Player player) {
		int money = plugin.getConfig().getInt(player.getName().toString());
		return money;
	
	}
	
	
	public static boolean checkMoney(Player player, int i, int p) {
		i = getMoney(player);
		if(i >= p) {
			return true;
		} else {
			return false;
		}
		
	}
}
