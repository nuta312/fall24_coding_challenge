package coding_bat.delnura.string_1;

public class lastChars {
    public String lastChars(String a, String b) {
        char firstCharA = (a.length() > 0) ? a.charAt(0) : '@';

        char lastCharB = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';

        return "" + firstCharA + lastCharB;
    }
}
