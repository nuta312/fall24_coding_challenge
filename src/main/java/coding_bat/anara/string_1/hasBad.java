package coding_bat.anara.string_1;

public class hasBad {
    public boolean hasBad(String str) {
        if (str.length() == 3 && str.equals("bad"))
            return true;
        else if (str.length() >= 4 && (str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad"))){
            return true;
        } return false;
    }
}
