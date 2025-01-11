package coding_bat.begayim.string2;

public class BobThere {
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.startsWith("b") && sub.endsWith("b")) {
                return true;
            }
        }
        return false;
    }
}
