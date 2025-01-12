package coding_bat.bermet.warmup1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean isA = (a >= 13 && a <= 19);
        boolean isB = (b >= 13 && b <= 19);
        if ((isA && !isB) || (isB && !isA)){
            return true;
        } else{
            return false;
        }
    }
}
