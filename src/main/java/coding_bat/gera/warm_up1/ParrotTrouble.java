package coding_bat.gera.warm_up1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour > 20 || hour < 7 )){
            return true;
        }
        else {
            return false;
        }
    }
}
