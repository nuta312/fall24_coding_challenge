package coding_bat.aiza.warm_up1;

public class max1020 {
    public int max1020(int a, int b) {
        boolean inRangeA = a >= 10 && a <= 20;
        boolean inRangeB = b >= 10 && b <= 20;
        if (inRangeA && inRangeB) {
            return Math.max(a, b);
        }
        if (inRangeA) {
            return a;
        }
        if (inRangeB) {
            return b;
        }
        return 0;
    }
}
