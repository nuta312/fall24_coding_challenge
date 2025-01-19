package coding_bat.altosh.warm_up1;

public class NearHunder {
    public boolean nearHundred(int n) {
        if (n <= 210 && n >= 190 || n >= 90 && n <= 110){
            return true;
        }else {
            return false;
        }

    }
}
