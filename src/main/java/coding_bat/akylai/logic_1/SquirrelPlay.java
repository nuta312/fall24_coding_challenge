package coding_bat.akylai.logic_1;

public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp > 60 && temp <= 90) {
            return true;
        } else if (temp < 60) {
            return false;
        }
        if ((temp > 60 && temp <= 100) && !isSummer) {
            return false;
        } else if (temp > 100) {
            return false;
        } else {
            return true;
        }
    }
}
