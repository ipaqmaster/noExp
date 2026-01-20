package io.papermc.noexp;

import org.bukkit.plugin.java.JavaPlugin;
import static org.bukkit.Bukkit.getServer;

public class noExp extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ExpListener(), this);
    }
}
