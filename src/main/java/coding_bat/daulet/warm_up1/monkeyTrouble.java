package coding_bat.daulet.warm_up1;

public class monkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile || bSmile) && (aSmile && bSmile) || (aSmile && bSmile)
                || (!aSmile && !bSmile)){
            return true;
        }
        return false;
    }
}
