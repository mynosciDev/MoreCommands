package fr.mynosci.morecommands.commands;

import fr.mynosci.morecommands.MoreCommands;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if(p.hasPermission("morecommands.broadcast")) {
            if(strings.length == 0) {
                p.sendMessage("§cUsage: /bc <message>");
                return false;
            }
            StringBuilder message = new StringBuilder();
            for(String part : strings) {
                message.append(part).append(" ");
            }
            String coloredmessage = ChatColor.translateAlternateColorCodes('&', message.toString());
            p.getServer().broadcastMessage(MoreCommands.getPlugin(MoreCommands.class).getConfig().getString("broadcast_prefix") + coloredmessage);
            return true;
        }
        return false;
    }
}
