package coding_bat.akylai.string_2;

public class ZipZap {
    public String zipZap(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length() - 2; i++) {
            if (chars[i] == 'z' && chars[i + 2] == 'p') {
                chars[i + 1] = ' ';
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (c != ' ') {
                result.append(c);
            }
        }
        return result.toString();
    }
}
