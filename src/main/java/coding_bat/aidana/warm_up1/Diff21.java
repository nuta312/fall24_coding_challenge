package coding_bat.aidana.warm_up1;

public class Diff21 {
    public int diff21(int n) {
        int difference = 21 - n;

        if (n > 21) {
            difference = Math.abs(difference) * 2;
        }
        return difference;
    }
}
