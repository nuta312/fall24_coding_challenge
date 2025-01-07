package coding_bat.akylai.warm_up1;

public class Close10 {
    public int close10(int a, int b) {
        int distance1 = (Math.abs(a - 10));
        int distance2 = (Math.abs(b - 10));
        if (distance1 < distance2) {
            return a;
        } else if (distance1 > distance2) {
            return b;
        } else {
            return 0;
        }
    }
}
