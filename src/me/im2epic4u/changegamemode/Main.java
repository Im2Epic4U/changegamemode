package me.im2epic4u.changegamemode;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public final Logger logger;
	public static Main plugin;
	boolean gmc;
	boolean gms;
	boolean gmsp;
	boolean gma;

	public Main() {
		this.logger = Logger.getLogger("Minecraft");
	}

	public void onDisable() {
		this.logger.info("[ChangeGamemode] ChangeGamemode has been disabled!");
	}

	public void onEnable() {
		this.logger.info("[ChangeGamemode] ChangeGamemode v1.0 has been enabled!");
	}

	public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel,
			final String[] args) {
		final Player player = (Player) sender;
		if (commandLabel.equalsIgnoreCase("gms") && player.isOp()) {
			player.setGameMode(GameMode.SURVIVAL);
			player.sendMessage(ChatColor.DARK_RED + "ChangeGamemode " + ChatColor.DARK_GRAY + ">" + ChatColor.GREEN + " You are now in survival mode.");
		} else if (commandLabel.equalsIgnoreCase("gmc") && player.isOp()) {
			player.setGameMode(GameMode.CREATIVE);
			player.sendMessage(ChatColor.DARK_RED + "ChangeGamemode " + ChatColor.DARK_GRAY + ">" + ChatColor.GREEN + " You are now in creative mode.");
		} else if (commandLabel.equalsIgnoreCase("gma") && player.isOp()) {
			player.setGameMode(GameMode.ADVENTURE);
			player.sendMessage(ChatColor.DARK_RED + "ChangeGamemode " + ChatColor.DARK_GRAY + ">" + ChatColor.GREEN + " You are now in adventure mode.");
		} else if (commandLabel.equalsIgnoreCase("gmsp") && player.isOp()) {
			player.setGameMode(GameMode.SPECTATOR);
			player.sendMessage(ChatColor.DARK_RED + "ChangeGamemode " + ChatColor.DARK_GRAY + ">" + ChatColor.GREEN + " You are now in spectator mode.");
		} else if (commandLabel.equalsIgnoreCase("gm") && player.isOp()) {
			player.sendMessage(ChatColor.STRIKETHROUGH + "---------------------------------------");
			player.sendMessage(ChatColor.GREEN + "Thank you for installing ChangeGamemode!");
			player.sendMessage(ChatColor.GREEN + "This plugin is self-explanatory.");
			player.sendMessage(ChatColor.GREEN + "The commands for this plugin are: /gmc, /gms,");
			player.sendMessage(ChatColor.GREEN + "/gma, and /gmsp.");
			player.sendMessage(ChatColor.BLUE + "Plugin made by Im2Epic4U.");
			player.sendMessage(ChatColor.STRIKETHROUGH + "---------------------------------------");
		}
		return false;
	}
}

