package coding_bat.rano.string2;

public class XyBalance {
    public boolean xyBalance(String str) {
        int lastX = str.lastIndexOf('x');
        int lastY = str.lastIndexOf('y');
        return lastX == -1 || lastY >= lastX;
    }
}
