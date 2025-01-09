package coding_bat.gera.warm_up1;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if( aSmile && bSmile){
            return true;
        }
        else if(!aSmile && !bSmile){
            return true;
        }
        else {
            return false;
        }
    }
}
