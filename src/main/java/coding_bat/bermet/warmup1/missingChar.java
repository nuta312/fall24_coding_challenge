package coding_bat.bermet.warmup1;

public class missingChar {
    public String missingChar(String str, int n) {
        String before = str.substring(0, n);
        String after = str.substring(n + 1);
        return before + after;
    }
}
