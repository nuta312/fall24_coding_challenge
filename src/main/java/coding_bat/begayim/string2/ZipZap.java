package coding_bat.begayim.string2;

public class ZipZap {
    public String zipZap(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append("zp");
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
