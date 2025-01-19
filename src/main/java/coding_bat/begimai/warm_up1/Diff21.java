package coding_bat.begimai.warm_up1;

public class Diff21 {
    public int diff21(int n) {
        int num = n - 21;
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;

        }
    }
}
