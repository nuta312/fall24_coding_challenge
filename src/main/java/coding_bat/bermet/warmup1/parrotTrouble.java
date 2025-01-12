package coding_bat.bermet.warmup1;

public class parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 7 && hour > 20) {
            if (hour >= 1 && hour <= 7) {
                return true;
            } else if (hour > 20 && hour < 24) {
                return true;
            }
        } else if (hour >= 7 && hour <= 20) {
            return false;
        }
        return talking;
    }
}
