package coding_bat.gera.string1;

public class HasBad {
    public boolean hasBad(String str) {
        if ( str.length() > 0  && (str.startsWith("bad") || str.substring(1).startsWith("bad"))){
            return true;
        }
        else if (str.length() >= 0 ){
            return false;
        }
        else {
            return false;
        }
    }
}
