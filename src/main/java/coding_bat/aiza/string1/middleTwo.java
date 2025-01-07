package coding_bat.aiza.string1;

public class middleTwo {
    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1,mid + 1);
    }
}
