package coding_bat.anara.warm_up2;

public class altPairs {
    public String altPairs(String str) {
        if (str.length() < 2) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            result.append(str.charAt(i));
            if (i + 1 < str.length()) {
                result.append(str.charAt(i + 1));

            }
        }
        return result.toString();

    }
}
