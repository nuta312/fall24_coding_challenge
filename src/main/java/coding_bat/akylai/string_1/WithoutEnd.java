package coding_bat.akylai.string_1;

public class WithoutEnd {
    public String withoutEnd(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }
}
