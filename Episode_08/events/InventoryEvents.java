package com.technovision.tutorial.events;

import com.technovision.tutorial.inventories.SelectionScreen;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryEvents implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) { return; }
        if (e.getClickedInventory().getHolder() instanceof SelectionScreen) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            if (e.getCurrentItem() == null) { return; }
            if (e.getCurrentItem().getType() == Material.LIME_STAINED_GLASS_PANE) {
                player.sendMessage(ChatColor.GREEN + "You have selected the 'accept' button");
                player.closeInventory();
            }
            else if (e.getSlot() == 4) {
                player.sendMessage(ChatColor.AQUA + "Please make a selection...");
            }
            else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE) {
                player.sendMessage(ChatColor.RED + "You have selected the 'deny' button");
                player.closeInventory();
            }
        }
    }
}
