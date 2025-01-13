package coding_bat.begayim.string1;

public class MiddleThree {
    public String middleThree(String str) {
        int len = str.length();
        int mid = len / 2;
        return str.substring(mid - 1, mid + 2);
    }
}
