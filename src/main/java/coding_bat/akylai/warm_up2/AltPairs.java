package coding_bat.akylai.warm_up2;

public class AltPairs {
    public String altPairs(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            if (i + 1 < str.length()) {
                result.append(str.charAt(i));
                result.append(str.charAt(i + 1));
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
