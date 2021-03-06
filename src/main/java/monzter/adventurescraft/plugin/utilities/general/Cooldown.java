package monzter.adventurescraft.plugin.utilities.general;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Cooldown {
    private static Map<String, Cooldown> cooldowns = new HashMap<String, Cooldown>();
    private long start;
    private final double timeInSeconds;
    private final UUID id;
    private final String cooldownName;

    public Cooldown(UUID id, String cooldownName, double timeInSeconds) {
        this.id = id;
        this.cooldownName = cooldownName;
        this.timeInSeconds = timeInSeconds;
    }

    public static boolean isInCooldown(UUID id, String cooldownName) {
        if (getTimeLeft(id, cooldownName) >= 0) {
            return true;
        } else {
            stop(id, cooldownName);
            return false;
        }
    }

    private static void stop(UUID id, String cooldownName) {
        Cooldown.cooldowns.remove(id + cooldownName);
    }

    private static Cooldown getCooldown(UUID id, String cooldownName) {
        return cooldowns.get(id.toString() + cooldownName);
    }

    public static double getTimeLeft(UUID id, String cooldownName) {
        Cooldown cooldown = getCooldown(id, cooldownName);
        double timeLeft = -1;
        if (cooldown != null) {
            long now = System.currentTimeMillis();
            long cooldownTime = cooldown.start;
            double totalTime = cooldown.timeInSeconds;
            double secondsResult = (now - cooldownTime) / 1000;
            double millisecondsResult = (now - cooldownTime) % 1000;
            timeLeft = ((secondsResult - totalTime) * (-1)) - (millisecondsResult / 1000);
        }
        return timeLeft;
    }

    public static DecimalFormat df = new DecimalFormat("#.##");

    public static String getTimeLeftTrimmed(UUID id, String cooldownName) {
        return df.format(getTimeLeft(id, cooldownName));
    }

    public static String getTimeLeftFormatted(UUID id, String cooldownName) {
        int minutes = (int) getTimeLeft(id, cooldownName) / 60;
        int seconds = (int) getTimeLeft(id, cooldownName) % 60;

        if (minutes == 0)
            return seconds + " seconds";
        else
            return minutes + " minutes " + seconds + " seconds";
    }

    public void start() {
        this.start = System.currentTimeMillis();
        cooldowns.put(this.id.toString() + this.cooldownName, this);
    }
}
