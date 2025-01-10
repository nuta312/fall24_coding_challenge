package coding_bat.arsen.D.string_1;

public class conCat {
    public String conCat(String a, String b) {
        if ((a.length() > 0 && b.length()> 0) && a.substring(a.length()-1).equals(b.substring(0,1))) {
            return a.concat(b.substring(1,b.length()));
        }return a.concat(b);
    }
}
