package coding_bat.arsen.D.string_1;

public class MiddleThree {

    public String middleThree(String str) {
        int min = str.length() / 2;
        return str.substring(min -1, min +2);
    }
}
