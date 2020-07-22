package com.technovision.tutorial;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Tutorial]: Plugin is enabled!");
    }

    @Override
    public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Tutorial]: Plugin is disabled!");
	}

}
