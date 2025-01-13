package coding_bat.anara.string_1;

public class withouEnd2 {
    public String withouEnd2(String str) {
        if (str.length() >= 3)
            return str.substring(1, str.length() - 1);
        return "";
    }
}
