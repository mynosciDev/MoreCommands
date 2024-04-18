package fr.mynosci.morecommands.commands;

import fr.mynosci.morecommands.MoreCommands;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
// ? le message ne se broadcast pas mais en revenche il se met en survival
// Essaye la
public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        String prefix = MoreCommands.getPlugin(MoreCommands.class).getConfig().getString("prefix");
        p.sendMessage(prefix + MoreCommands.locale);
        if (p.hasPermission("morecommands.gamemode")) {
            if (strings.length == 0) {
                p.sendMessage("§cUsage: /gamemode <mode> [player]");
                return false;
            }
            if (strings.length == 1) {
                if (strings[0].equalsIgnoreCase("0") || strings[0].equalsIgnoreCase("survival")) {
                    p.setGameMode(org.bukkit.GameMode.SURVIVAL);
                    if (MoreCommands.locale.equalsIgnoreCase("fr")) {
                        p.sendMessage(prefix + "§aVotre mode de jeu a été changé en §cSurvie");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("en")) {
                        p.sendMessage(prefix + "§aYour gamemode has been changed to §cSurvival");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("es")) {
                        p.sendMessage(prefix + "§aTu modo de juego ha sido cambiado a §cSupervivencia");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("de")) {
                        p.sendMessage(prefix + "§aIhr Spielmodus wurde geändert in §cÜberleben");
                    }
                }
                if (strings[0].equalsIgnoreCase("1") || strings[0].equalsIgnoreCase("creative")) {
                    p.setGameMode(org.bukkit.GameMode.CREATIVE);
                    if (MoreCommands.locale.equalsIgnoreCase("fr")) {
                        p.sendMessage(prefix + "§aVotre mode de jeu a été changé en §cCréatif");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("en")) {
                        p.sendMessage(prefix + "§aYour gamemode has been changed to §cCreative");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("es")) {
                        p.sendMessage(prefix + "§aTu modo de juego ha sido cambiado a §cCreativo");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("de")) {
                        p.sendMessage(prefix + "§aIhr Spielmodus wurde geändert in §cKreativ");
                    }
                }
                if (strings[0].equalsIgnoreCase("2") || strings[0].equalsIgnoreCase("adventure")) {
                    p.setGameMode(org.bukkit.GameMode.ADVENTURE);
                    if (MoreCommands.locale.equalsIgnoreCase("fr")) {
                        p.sendMessage(prefix + "§aVotre mode de jeu a été changé en §cAventure");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("en")) {
                        p.sendMessage(prefix + "§aYour gamemode has been changed to §cAdventure");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("es")) {
                        p.sendMessage(prefix + "§aTu modo de juego ha sido cambiado a §cAventura");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("de")) {
                        p.sendMessage(prefix + "§aIhr Spielmodus wurde geändert in §cAbenteuer");
                    }
                }
                if (strings[0].equalsIgnoreCase("3") || strings[0].equalsIgnoreCase("spectator")) {
                    p.setGameMode(org.bukkit.GameMode.SPECTATOR);
                    if (MoreCommands.locale.equalsIgnoreCase("fr")) {
                        p.sendMessage(prefix + "§aVotre mode de jeu a été changé en §cSpectateur");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("en")) {
                        p.sendMessage(prefix + "§aYour gamemode has been changed to §cSpectator");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("es")) {
                        p.sendMessage(prefix + "§aTu modo de juego ha sido cambiado a §cEspectador");
                    }
                    if (MoreCommands.locale.equalsIgnoreCase("de")) {
                        p.sendMessage(prefix + "§aIhr Spielmodus wurde geändert in §cZuschauer");
                    }
                }
            }
        }
        return true;
    }
}