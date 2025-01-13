package coding_bat.akylai.string_2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        if (n == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++){
            result.append(str.substring(0, n-i));
        }

        return result.toString();
    }
}
