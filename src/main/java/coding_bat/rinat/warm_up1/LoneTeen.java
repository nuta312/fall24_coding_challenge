package coding_bat.rinat.warm_up1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        if (a >= 13 && a <= 19){
            if (b < 13 || b > 19){
                return true;
            }
        }
        if (b >= 13 && b <= 19){
            if (a < 13 || a > 19){
                return true;
            }
        }
        return false;

    }
}
