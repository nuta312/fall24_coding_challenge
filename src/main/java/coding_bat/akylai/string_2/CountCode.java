package coding_bat.akylai.string_2;

public class CountCode {
    public int countCode(String str) {
        int count = 0;
        if (str.length() < 4) {
            count = 0;
        } else {
            for (int i = 0; i < str.length() - 3; i++) {
                if (str.substring(i, i + 2).equalsIgnoreCase("co") && str.charAt(i+3)=='e') {
                    count += 1;
                }
            }
        }
        return count;
    }
}
