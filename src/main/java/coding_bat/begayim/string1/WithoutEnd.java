package coding_bat.begayim.string1;

public class WithoutEnd {
    public String withoutEnd(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return "Should be at least 2";
        }
    }
}
