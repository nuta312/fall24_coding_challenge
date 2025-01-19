package coding_bat.anara.string_1;

public class extraEnd {
    public String extraEnd(String str) {
        if (str.length() >= 2) {
            str = str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length())
                    + str.substring(str.length() - 2, str.length());
        }
        return str;
    }
}
