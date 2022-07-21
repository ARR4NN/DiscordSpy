package com.arr4nn.discordspy.Events;

import com.palmergames.bukkit.TownyChat.events.AsyncChatHookEvent;
import com.palmergames.bukkit.towny.Towny;
import com.palmergames.bukkit.towny.listeners.TownyCustomListener;
import org.bukkit.event.EventHandler;

public class townyChat extends TownyCustomListener {
  public townyChat(Towny instance) {
    super(instance);
  }
  @EventHandler
  public void onAsyncChat(AsyncChatHookEvent event) {
    System.out.println("AsyncChatHookEvent");
  }


}
