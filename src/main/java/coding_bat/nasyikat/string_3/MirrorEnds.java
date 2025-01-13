package coding_bat.nasyikat.string_3;

public class MirrorEnds {
    public String mirrorEnds(String string) {
        int n = string.length();
        StringBuilder mirror = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (string.charAt(i) == string.charAt(n - 1 - i)) {
                mirror.append(string.charAt(i));
            } else {
                break;
            }
        }
        return mirror.toString();
    }
}
