package safe.safe;

import io.papermc.paper.event.player.PlayerArmSwingEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class SAFE extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

            System.out.println("It's safe to use the SAFE plugin. Trust me");


    }



    private static List disablePVP = new ArrayList();
    @EventHandler
    public void disablePvP(EntityDamageEvent e) {
        Player p = (Player) e.getEntity();

        if (p instanceof Player) {
            if (disablePVP.contains(((Player)p).getName())) {
                e.setCancelled(true);
            } else {
                e.setCancelled(false);
            }
        }
    }

}




