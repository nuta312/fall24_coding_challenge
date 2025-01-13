package coding_bat.akylai.string_2;

public class XyzThere {
    public boolean xyzThere(String str) {
        String part = "xyz";
        String regex = "(?<!\\.)" + part;
        if (str.length() > 2) {
            if (str.matches(".*" + regex + ".*")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
