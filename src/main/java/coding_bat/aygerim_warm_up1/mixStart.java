package coding_bat.aygerim_warm_up1;

public class mixStart {
    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String two = str.substring(1,3);
        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }
}
