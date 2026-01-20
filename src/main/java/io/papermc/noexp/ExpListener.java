package io.papermc.noexp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class ExpListener implements Listener {

    @EventHandler
    public void onExpGain(PlayerExpChangeEvent event) {
        // Cancel XP gain
        event.setAmount(0);

        // Force player's XP to zero (Covering all bases)
        event.getPlayer().setExp(0.0f);
        event.getPlayer().setTotalExperience(0);
        event.getPlayer().setLevel(0);
    }
}