package coding_bat.aiza.string1;

public class conCat {
    public String conCat(String a, String b) {
        if (a.isEmpty()){
            return b;
        }
        if (b.isEmpty()){
            return a;
        }
        if (a.charAt(a.length()-1) == b.charAt(0)){
            return a.substring(0,a.length()-1) +b;
        }
        return a + b;
    }
}
