package coding_bat.aiperiishenbekkyzy.warm_up1;

public class parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20))
            return true;
        else
            return false;
    }
}