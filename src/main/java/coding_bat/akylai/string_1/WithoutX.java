package coding_bat.akylai.string_1;

public class WithoutX {
    public String withoutX(String str) {
        if (str.length() <= 1) {
            return "";
        } else {
            if (str.substring(0, 1).equals(str.substring(str.length() - 1))) {
                return str.substring(1, str.length() - 1);
            } else if (str.toLowerCase().startsWith("x")) {
                return str.substring(1);
            } else if (str.endsWith("x")) {
                return str.substring(0, str.length() - 1);
            }
            return str;
        }
    }
}
