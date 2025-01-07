package coding_bat.delnura.string_1;

public class firstTwo {
    public String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        return str;
    }
}
