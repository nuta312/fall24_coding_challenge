package coding_bat.Maksim.string_3;

public class SameEnds {
    public String sameEnds(String string) {
        int n = string.length();
        for (int length = n / 2; length > 0; length--) {
            String prefix = string.substring(0, length);
            String suffix = string.substring(n - length);
            if (prefix.equals(suffix)) {
                return prefix;
            }
        }
        return "";
    }
}
