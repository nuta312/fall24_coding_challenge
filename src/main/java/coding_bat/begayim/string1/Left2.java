package coding_bat.begayim.string1;

public class Left2 {
    public String left2(String str) {
        if (str.length() > 2) {
            return str.substring(2) + str.substring(0, 2);
        }
        return str;
    }
}
