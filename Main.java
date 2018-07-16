package com.talmuseri.battatautil;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import com.command.il.cmdblockapi.CmdBlockAPI;

public class Main extends JavaPlugin {
	
	private CmdBlockAPI api = (CmdBlockAPI) Bukkit.getServer().getPluginManager().getPlugin("CommandBlockAPI");
	
	@Override
	public void onEnable() {
		this.getCommand("neat").setExecutor((CommandExecutor)new NeatCommand());
		getLogger().info("BattataUtil has been enabled.");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("BattataUtil has been disabled.");
	}
}
