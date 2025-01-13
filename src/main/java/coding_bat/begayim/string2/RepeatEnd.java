package coding_bat.begayim.string2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String lastNChars = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        return result.toString();
    }
}
