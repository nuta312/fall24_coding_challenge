package coding_bat.begayim.string1;

public class Right2 {
    public String right2(String str) {
        if (str.length() <= 2) {
            return str;
        }
        String lastTwoChars = str.substring(str.length() - 2);
        String firstPart = str.substring(0, str.length() - 2);

        return lastTwoChars + firstPart;
    }
}
