package coding_bat.begayim.logic1;

public class TeenSum {
    public int teenSum(int a, int b) {
        if (isTeen(a) || isTeen(b)) {
            return 19;
        }
        return a + b;
    }
    private boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }
}
