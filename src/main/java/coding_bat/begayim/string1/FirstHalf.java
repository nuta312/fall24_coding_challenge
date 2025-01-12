package coding_bat.begayim.string1;

public class FirstHalf {
    public String firstHalf(String str) {
        int halfLength = str.length() / 2;
        return str.substring(0, halfLength);
    }
}
