package coding_bat.kaniiu.warm_up1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean ateen = (a >= 13 && a <= 19);
        boolean bteen = (b >= 13 && b <= 19);
        return (ateen && !bteen || !ateen && bteen);
    }
}
