package coding_bat.bermet.string1;

public class MinCat {
    public String minCat(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        a = a.substring(a.length() - minLength);
        b = b.substring(b.length() - minLength);
        return a + b;
    }
}
