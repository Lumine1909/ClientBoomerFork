package io.wdsj.clientboomerpacketevents;

import org.bukkit.entity.Player;

public class Utils {
    public static boolean isClassLoaded(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /**
     * Returns the IP of the given player.
     *
     * @param player The player to return the IP address for
     * @return The player's IP address
     */
    public static String getPlayerIp(Player player) {
        return player.getAddress().getAddress().getHostAddress();
    }
}
