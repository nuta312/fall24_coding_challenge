package coding_bat.nasyikat.warm_up2;

public class DoubleX {
    boolean doubleX(String str) {
        int firstindex = str.indexOf('x');
        if (firstindex != -1 && firstindex +1 < str.length()
                && str.charAt(firstindex + 1) == 'x') {
            return true;
        }
        return false;
    }
}
