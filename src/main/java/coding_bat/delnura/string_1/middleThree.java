package coding_bat.delnura.string_1;

public class middleThree {
    public String middleThree(String str) {
        int middleIndex = str.length() / 2;

        return str.substring(middleIndex - 1, middleIndex + 2);
    }
}
