package coding_bat.anara.string_1;

public class lastChars {
    public String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() > 1) {
            return "@" + b.substring(b.length()-1);
        } else if (a.length() > 1 && b.length() == 0) {
            return a.substring(0,1) + "@";
        } else if (a.length() == 0 && b.length() == 0) {
            return "@@";
        }
        return a.substring(0,1) + b.substring(b.length()-1);
    }
}
