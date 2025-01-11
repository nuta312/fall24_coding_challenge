package coding_bat.begayim.string2;

public class StarOut {
    public String starOut(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ((i > 0 && str.charAt(i - 1) == '*') ||
                    (i < str.length() - 1 && str.charAt(i + 1) == '*') ||
                    (str.charAt(i) == '*')) {
                continue;
            }
            result.append(str.charAt(i));
        } return result.toString();
    }
}
