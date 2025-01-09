package coding_bat.rano.string2;

public class mixString {
    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        if (a.length() > b.length()) {
            result.append(a.substring(minLength));
        } else if (b.length() > a.length()) {
            result.append(b.substring(minLength));
        }
        return result.toString();
    }
}
