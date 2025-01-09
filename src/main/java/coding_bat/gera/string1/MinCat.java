package coding_bat.gera.string1;

public class MinCat {
    public String minCat(String a, String b) {
        if (a.length() > b.length()){
            String c = a.substring(a.length()-b.length());// a.substring(b.length());
            return c.concat(b);
        } else if (b.length() > a.length()) {
            String c = b.substring(b.length()-a.length());
            return a.concat(c);
        }
        return a.concat(b);
    }

}
