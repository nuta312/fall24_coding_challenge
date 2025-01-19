package coding_bat.Murat.Warmup2;

public class DoubleX {
    boolean doubleX(String str) {
        int first = 0;
        if (str.contains("x")) {
            first = str.indexOf('x');
            if (str.length() == 1 || str.indexOf('x') == str.length() - 1) return false;
            if (str.charAt(first) == str.charAt(first + 1)) return true;
        }
        return false;
    }
}