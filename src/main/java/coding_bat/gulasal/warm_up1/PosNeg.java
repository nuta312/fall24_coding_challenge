package coding_bat.gulasal.warm_up1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        return (((a > 0 && b < 0) || (a < 0 && b > 0)) && negative == false)
                || (a < 0 && b < 0 && negative == true);
    }

}
