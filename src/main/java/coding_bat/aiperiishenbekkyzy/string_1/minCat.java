package coding_bat.aiperiishenbekkyzy.string_1;

public class minCat {
    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        } else {
            if (a.length() > b.length()) {
                return a.substring(a.length() - b.length(), a.length()) + b;
            } else {
                return a + b.substring(b.length() - a.length(), b.length());
            }
        }
    }
}
