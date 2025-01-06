package coding_bat.agema.warm_up1;

public class posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if(negative)
            return a < 0 && b < 0;
        else
            return a * b < 0;
    }
}
