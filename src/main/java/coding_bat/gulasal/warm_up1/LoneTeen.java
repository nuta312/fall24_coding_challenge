package coding_bat.gulasal.warm_up1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        return (!(a >= 13 && a <= 19) && (b >= 13 && b <= 19)) || ((a >= 13 && a <= 19) && !(b >= 13 && b <= 19));
    }

}
