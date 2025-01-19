package coding_bat.nurdan.warm_up1;

public class Sleepin {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
}
