package coding_bat.akylai.string_1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if (str.length() <= index + 1 || index < 0) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }
}
