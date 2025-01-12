package coding_bat.anara.string_1;

public class minCat {
    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a.concat(b);
        } else if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()) + b;

        } else {
            return (a + b.substring(b.length() - a.length()));
        }
    }
}
