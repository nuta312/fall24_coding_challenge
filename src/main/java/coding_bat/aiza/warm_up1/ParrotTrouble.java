package coding_bat.aiza.warm_up1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour < 7 || hour > 20)&& talking ){
            return true;
        }
        else if ((hour >= 7 || hour <= 20)&& talking){
            return  false;
        }
        return talking;
    }
}
