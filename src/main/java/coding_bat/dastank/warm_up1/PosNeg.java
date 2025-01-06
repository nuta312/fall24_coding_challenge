package coding_bat.dastank.warm_up1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        return ((a>0&&b<0&&!negative)||(a<0&&b>0&&!negative)||(a<0&&b<0&&negative));
    }
}
