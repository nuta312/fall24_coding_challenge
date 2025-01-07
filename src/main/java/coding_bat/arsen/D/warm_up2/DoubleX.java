package coding_bat.arsen.D.warm_up2;

public class DoubleX {
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        if (i +1 < str.length() && str.charAt (i + 1) == 'x'){
            return true;
        }
        return false;
    }
}
