package coding_bat.rano.string1;

public class MiddleThree {
    public String middleThree(String str) {
        int midIndex = str.length() / 2;
        return str.substring(midIndex - 1, midIndex + 2);
    }
}
