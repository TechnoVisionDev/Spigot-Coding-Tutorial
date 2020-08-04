package com.technovision.tutorial;

import com.technovision.tutorial.commands.TutorialCommands;
import com.technovision.tutorial.events.InventoryEvents;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("select").setExecutor(new TutorialCommands());
        getServer().getPluginManager().registerEvents(new InventoryEvents(), this);
    }

    @Override
    public void onDisable() { }

}
