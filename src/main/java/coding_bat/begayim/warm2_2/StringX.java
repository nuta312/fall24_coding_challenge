package coding_bat.begayim.warm2_2;

public class StringX {
    public String stringX(String str) {
        if (str.length() <= 2) return str;
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                result.append(str.charAt(i));
            }
        }
        result.append(str.charAt(str.length() - 1));
        return result.toString();
    }
}
