package coding_bat.akylai.string_1;

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.length() <= 1) {
            return "";
        } else {
            if (str.substring(0, 2).equalsIgnoreCase("xx")) {
                return str.substring(2);
            } else if (str.startsWith("x")) {
                return str.substring(1);
            } else if (str.substring(1, 2).contains("x")) {
                return str.charAt(0) + str.substring(2);
            }
            return str;
        }
    }
}
