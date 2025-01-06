package coding_bat.alia_warmup1;

public class monkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile){
            return true;
        }else if (!aSmile && ! bSmile){
            return true;
        }
        return false;
    }

}
