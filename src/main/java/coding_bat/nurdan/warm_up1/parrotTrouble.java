package coding_bat.nurdan.warm_up1;

public class parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)){
            return true;
        } return false;
    }
}
