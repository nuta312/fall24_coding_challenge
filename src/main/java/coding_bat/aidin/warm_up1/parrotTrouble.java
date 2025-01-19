package coding_bat.aidin.warm_up1;

public class parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && ( hour < 7 || hour > 20);
    }

}
