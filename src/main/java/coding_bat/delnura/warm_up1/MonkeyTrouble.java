package coding_bat.delnura.warm_up1;

public class MonkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile){
            return true;
        }if (!aSmile && !bSmile){
            return true;
        }
        return false;
    }
}
