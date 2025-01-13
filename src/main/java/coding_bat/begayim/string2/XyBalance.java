package coding_bat.begayim.string2;

public class XyBalance {
    public boolean xyBalance(String str) {
        int lastIndexX = str.lastIndexOf('x');
        int lastIndexY = str.lastIndexOf('y');

        return lastIndexY >= lastIndexX;
    }
}
