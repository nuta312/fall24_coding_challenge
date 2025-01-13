package coding_bat.rinat.String1;

public class HasBad {
    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        } else if (str.length() == 3) {
            if (str.equalsIgnoreCase("bad")){
                return true;
            } else {
                return false;
            }
        } else if (str.substring(0,3).equalsIgnoreCase("bad")) {
            return true;
        } else if (str.substring(1,4).equalsIgnoreCase("bad")){
            return true;
        } else {
            return false;
        }
    }
}
