package coding_bat.rano.warm_up1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        int max = a ;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
