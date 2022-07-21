package com.arr4nn.discordspy;

import com.arr4nn.discordspy.Events.ChatEvents;
import com.arr4nn.discordspy.Events.townyChat;
import com.palmergames.bukkit.TownyChat.listener.LocalTownyChatEvent;
import com.palmergames.bukkit.towny.Towny;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordSpy extends JavaPlugin {
  @Override
  public void onEnable() {
    getServer().getPluginManager().registerEvents(new ChatEvents(Towny.getPlugin()), this);
    getLogger().info("Plugin Started");
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }
}
