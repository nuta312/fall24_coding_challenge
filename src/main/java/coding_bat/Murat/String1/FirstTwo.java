package coding_bat.Murat.String1;

public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length() >= 2) return str.substring(0, 2);
        else if (str.length() == 1) return str;
        return str;
    }
}