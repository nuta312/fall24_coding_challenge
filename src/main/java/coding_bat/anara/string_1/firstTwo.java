package coding_bat.anara.string_1;

public class firstTwo {
    public String firstTwo(String str) {
        if (str.length() >= 3)  {
            return str.substring(0,2);
        }
        return str;
    }
}
