package coding_bat.aygerim_warm_up1;

public class posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else{
            return((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}
