package fr.mynosci.morecommands;

import fr.mynosci.morecommands.commands.BroadcastCommand;
import fr.mynosci.morecommands.commands.GamemodeCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class MoreCommands extends JavaPlugin {

    public static String locale;

    /**
     * MoreCommands :
     * A plugin that adds more commands to the game
     *
     * @return
     * @author mynosci
     */





    public static void log(String message) {
        getPlugin(MoreCommands.class).getLogger().info(message);
    }

    public static void logError(String message) {
        getPlugin(MoreCommands.class).getLogger().severe(message);
    }

    public static void logWarning(String message) {
        getPlugin(MoreCommands.class).getLogger().warning(message);
    }

    public static void logDebug(String message) {
        if (getPlugin(MoreCommands.class).getConfig().getBoolean("debug")) {
            getPlugin(MoreCommands.class).getLogger().info("[DEBUG] " + message);
        }
    }


    @Override
    public void onEnable() {
        saveDefaultConfig();
        locale = getConfig().getString("locale");
        Bukkit.broadcastMessage("§alocale:" + locale);
        if(getConfig().getString("locale") == null) {
            logError("Locale not found in config.yml");
            getPlugin(MoreCommands.class).getServer().getPluginManager().disablePlugin(getPlugin(MoreCommands.class));
        }
        getPlugin(MoreCommands.class).getCommand("bc").setExecutor(new BroadcastCommand());
        getPlugin(MoreCommands.class).getCommand("gamemode").setExecutor(new GamemodeCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
