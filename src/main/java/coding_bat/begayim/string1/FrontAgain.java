package coding_bat.begayim.string1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        } else {
            String firstTwo = str.substring(0, 2);
            String lastTwo = str.substring(str.length() - 2);
            return firstTwo.equals(lastTwo);
        }
    }
}
