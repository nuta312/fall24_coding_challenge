package coding_bat.akylai.string_3;

public class MirrorEnds {
    public String mirrorEnds(String string) {
        StringBuilder result = new StringBuilder();
        int len = string.length();
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == string.charAt(len - 1 - i)) {
                result.append(string.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}
