package coding_bat.dastank.warm_up1;

public class Close10 {
    public int close10(int a, int b) {
        int c = Math.abs(a - 10);
        int d = Math.abs(b - 10);
        if (c < d) {
            return a;
        } else if (d < c) {
            return b;
        } else {
            return 0;
        }
    }
}