package coding_bat.delnura.string_1;

public class minCat {
    public String minCat(String a, String b) {
        int minLength = Math.min(a.length(), b.length());

        a = a.substring(a.length() - minLength);
        b = b.substring(b.length() - minLength);

        return a + b;
    }
}
