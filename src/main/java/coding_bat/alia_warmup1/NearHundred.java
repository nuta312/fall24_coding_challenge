package coding_bat.alia_warmup1;

public class NearHundred {
    public boolean nearHundred(int n) {
        return  (Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10);
    }
}
