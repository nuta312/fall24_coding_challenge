package coding_bat.begayim.warm_up1;

public class PosNeg {
    public boolean posNeg (int a, int b, boolean negative) {
        if (negative == true) {
            ;
            return a < 0 && b < 0;

        }
        return (a > 0 && b < 0) || (a < 0 && b > 0);

    }
}
