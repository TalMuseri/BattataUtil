package com.talmuseri.battatautil;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.command.il.cmdblockapi.CmdBlockAPI;

public class NeatCommand implements CommandExecutor {
	
	private CmdBlockAPI api = (CmdBlockAPI) Bukkit.getServer().getPluginManager().getPlugin("CommandBlockAPI");
	int neatOn = 0;
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] argument) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			if (neatOn == 0) {
				api.runCommand("gamerule commandBlockOutput false");
				api.runCommand("gamerule sendCommandFeedback false");
				player.sendMessage("Neat mode has been enabled.");
				neatOn = neatOn + 1;
			} else {
				api.runCommand("gamerule sendCommandFeedback true");
				api.runCommand("gamerule commandBlockOutput true");
				player.sendMessage("Neat mode has been disabled.");
				neatOn = neatOn - 1;
			}
		} else {
			sender.sendMessage("You cannot use this command in the console!");
		}
		return true;
	}
	
}
