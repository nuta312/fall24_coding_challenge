package coding_bat.kuba.warm_up1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour<7 || hour>20)) {
            return true;
        }else {
            return false;
        }
    }
}

