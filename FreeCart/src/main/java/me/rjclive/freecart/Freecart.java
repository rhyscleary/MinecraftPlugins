package me.rjclive.freecart;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Freecart extends JavaPlugin implements Listener {

    public void onEnable() {

        this.getCommand("freecart").setExecutor(new Cartcommand());


    }

    public void onDisable() {

    }






}
