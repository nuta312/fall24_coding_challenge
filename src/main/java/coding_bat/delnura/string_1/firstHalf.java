package coding_bat.delnura.string_1;

public class firstHalf {
    public String firstHalf(String str) {
        int halfLength = str.length() / 2;
        return str.substring (0,halfLength);
    }
}
