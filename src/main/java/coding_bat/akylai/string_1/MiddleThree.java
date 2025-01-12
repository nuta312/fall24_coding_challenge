package coding_bat.akylai.string_1;

public class MiddleThree {
    public String middleThree(String str) {
        int middle = str.length() / 2;
        if (str.length() % 2 != 0) {
            return str.substring(middle - 1, middle + 2);
        } else {
            return str;
        }
    }
}
