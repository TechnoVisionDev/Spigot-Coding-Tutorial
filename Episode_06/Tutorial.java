package com.technovision.tutorial;

import com.technovision.tutorial.commands.TutorialCommands;
import com.technovision.tutorial.events.TutorialEvents;
import com.technovision.tutorial.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemManager.init();
        getServer().getPluginManager().registerEvents(new TutorialEvents(), this);
        getCommand("givewand").setExecutor(new TutorialCommands());
    }

    @Override
    public void onDisable() { }

}
