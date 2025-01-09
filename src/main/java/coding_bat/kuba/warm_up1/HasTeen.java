package coding_bat.kuba.warm_up1;

public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        if (((a > 12) && (a <= 19)) || (( b > 12) && (b <= 19)) || ((c > 12) && (c <= 19))){
            return true;
        }
        return false;
    }
}
