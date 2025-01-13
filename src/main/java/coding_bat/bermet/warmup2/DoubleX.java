package coding_bat.bermet.warmup2;

public class DoubleX {
    boolean doubleX(String str) {
        int index = str.indexOf("x");
        if (index == -1){
            return false;
        }
        return index + 1 < str.length() && str.charAt(index + 1) == 'x';
    }
}
