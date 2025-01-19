package coding_bat.Murat.Warmup1;

public class NearHundred {
    public boolean nearHundred(int n) {
        if ((n - 100 <= 10 && 100 - n <= 10) || (n - 200 <= 10 && 200 - n <= 10)) return true;
        return false;
    }
}
