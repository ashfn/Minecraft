package dev.authorises.cavelet.command;

import dev.authorises.cavelet.gui.EnchantsGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class EnchantmentsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if(sender instanceof Player){
            Player p = (Player) sender;
            new EnchantsGUI(p, false);
        }
        return true;
    }

}
