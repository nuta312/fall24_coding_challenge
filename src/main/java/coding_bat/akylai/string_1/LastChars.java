package coding_bat.akylai.string_1;

public class LastChars {
    public String lastChars(String a, String b) {
        if (a.isEmpty()) {
            a = "@";
        }
        if (b.isEmpty()) {
            b = "@";
        }
        return a.charAt(0) + b.substring(b.length() - 1);
    }
}
