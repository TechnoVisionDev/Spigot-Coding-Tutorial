package com.technovision.tutorial;

import com.technovision.tutorial.commands.TutorialCommands;
import com.technovision.tutorial.events.TutorialEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        TutorialCommands commands = new TutorialCommands();
        getCommand("heal").setExecutor(commands);
        getCommand("feed").setExecutor(commands);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Tutorial]: Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Tutorial]: Plugin is disabled!");
    }

}
