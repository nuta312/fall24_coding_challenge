package coding_bat.altosh.warm_up1;

public class Diff21 {
    public int diff21(int n) {
        if ( n > 21)
        {

            return Math.abs(21 - n) * 2;

        }
        return Math.abs(n - 21);
    }
}
