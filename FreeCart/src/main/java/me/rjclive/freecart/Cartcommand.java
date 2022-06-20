package me.rjclive.freecart;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Cartcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack minecart = new ItemStack(Material.MINECART);

            player.getInventory().addItem(minecart);

            player.sendMessage(ChatColor.GOLD + "Here's a Minecart...");
        }
        return true;
    }
}
