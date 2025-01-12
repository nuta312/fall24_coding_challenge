package coding_bat.Maksim.string_1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String lastTwoChars = str.substring(str.length() - 2);
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }
}
