package coding_bat.albina.warm_up1;

public class parrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return ((hour < 7 || hour > 20)&&talking);
    }
}
