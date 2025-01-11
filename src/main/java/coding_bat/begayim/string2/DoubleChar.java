package coding_bat.begayim.string2;

public class DoubleChar {
    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            result.append(currentChar).append(currentChar);
        }
        return result.toString();
    }
}
