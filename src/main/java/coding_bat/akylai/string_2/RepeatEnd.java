package coding_bat.akylai.string_2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        if (n == 0) {
            return "";
        }
        String nChars = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(nChars);
        }
        return result.toString();
    }
}
