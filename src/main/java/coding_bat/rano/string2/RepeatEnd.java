package coding_bat.rano.string2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String lastN = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastN);
        }
        return result.toString();
    }
}
