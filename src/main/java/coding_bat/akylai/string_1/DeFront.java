package coding_bat.akylai.string_1;

public class DeFront {
    public String deFront(String str) {
        if (str.length() >= 2) {
            if (str.toLowerCase().startsWith("ab")) {
                return str;
            } else if (str.toLowerCase().startsWith("a")) {
                return str.charAt(0) + str.substring(2);
            } else if (str.substring(1, 2).startsWith("b")) {
                return str.substring(1);
            } else {
                return str.substring(2);
            }
        }
        return str;
    }
}
