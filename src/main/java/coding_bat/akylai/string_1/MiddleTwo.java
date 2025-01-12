package coding_bat.akylai.string_1;

public class MiddleTwo{
    public String middleTwo(String str) {
        if (str.length() % 2 == 0) {
            return str.substring((str.length() / 2) -1, (str.length() / 2) + 1);
        } else {
            return str.substring(str.length() / 2, (str.length() / 2) + 2);
        }
    }
}
