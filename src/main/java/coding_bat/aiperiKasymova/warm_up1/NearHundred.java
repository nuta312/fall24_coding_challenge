package coding_bat.aiperiKasymova.warm_up1;

public class NearHundred {
    public boolean nearHundred(int n) {
        if(Math.abs(n - 100) <= 10)
            return true;
        if (Math.abs(n - 200) <= 10)
            return true;
        return false;
    }
}
