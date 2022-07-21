package com.arr4nn.discordspy.Events;

import com.palmergames.bukkit.TownyChat.events.AsyncChatHookEvent;
import com.palmergames.bukkit.towny.Towny;
import com.palmergames.bukkit.towny.listeners.TownyCustomListener;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

public class ChatEvents extends TownyCustomListener {
  public ChatEvents(Towny instance) {
    super(instance);
  }

  @EventHandler
  public void onChat(AsyncChatHookEvent e) {
    System.out.println("Got event");
    Player p = e.getPlayer();
    String s = e.getChannel().toString();
    p.sendMessage("You spoke in: "+s);
  }
}
