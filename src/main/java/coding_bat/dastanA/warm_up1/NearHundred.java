package coding_bat.dastanA.warm_up1;

public class NearHundred {
    public boolean nearHundred(int n) {
        if (n >= 90 && n <= 110){
            return true;
        }
        else if (n >= 190 && n <= 210){
            return true;
        } else {
            return false;
        }
    }
}
