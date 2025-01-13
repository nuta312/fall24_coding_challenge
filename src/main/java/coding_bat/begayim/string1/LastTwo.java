package coding_bat.begayim.string1;

public class LastTwo {
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String result = str.substring(0, str.length() - 2);
            result += str.charAt(str.length() - 1);
            result += str.charAt(str.length() - 2);
            return result;
        }
    }
}
