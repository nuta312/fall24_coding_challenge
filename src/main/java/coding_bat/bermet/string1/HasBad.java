package coding_bat.bermet.string1;

public class HasBad {
    public boolean hasBad(String str) {
        if (str.length() <= 3) {
            if (str.length() == 3 && str.equals("bad")){
                return true;
            }
            return false;
        }
        return str.startsWith("bad") || str.substring(1, 4).equals("bad");
    }

}
