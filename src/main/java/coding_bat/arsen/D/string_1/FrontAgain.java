package coding_bat.arsen.D.string_1;

public class FrontAgain {

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);
        return firstTwo.equals(lastTwo);
    }
}
