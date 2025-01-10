package coding_bat.akylai.string_1;

public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }
}
