package coding_bat.abdykadyrov_turan.warm_up1;

public class Diff21 {
    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else if (n <= 21) {
            return 21 - n;
        }
        return n;
    }
}
