package coding_bat.akylai.string_1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2));
        } else {
            return false;
        }
    }
}
