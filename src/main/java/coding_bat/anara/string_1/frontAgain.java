package coding_bat.anara.string_1;

public class frontAgain {
    public boolean frontAgain(String str) {
        if (str.length() >= 2 && str.substring(0,2).equals(str.substring(str.length()-2, str.length())) ) {
            return true;
        }return false;
    }
}
