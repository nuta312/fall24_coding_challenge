package coding_bat.arsenK;

public class nearHundred {
    public boolean nearHundred(int n) {
        return ((Math.abs(200 - n) <= 10) ||
                (Math.abs(100 - n) <= 10));
    }
}
