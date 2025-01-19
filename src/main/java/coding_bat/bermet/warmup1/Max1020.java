package coding_bat.bermet.warmup1;

public class Max1020 {
    public int max1020(int a, int b) {
        boolean inRangeA = (a >= 10 && a <= 20);
        boolean inRangeB = (b >= 10 && b <= 20);
        if (inRangeA && inRangeB){
            return Math.max(a,b);
        } else if (inRangeA){
            return a;
        } else if (inRangeB){
            return b;
        } else {
            return 0;
        }
    }
}
