package coding_bat.begayim.string1;

public class MinCat {
    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()) + b;
        } else if (b.length() > a.length()) {
            return a + b.substring(b.length() - a.length());
        } else {
            return a + b;
        }
    }
}
