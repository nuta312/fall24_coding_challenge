package coding_bat.begimai.warm_up1;

public class MissingChar {
    public String missingChar(String str, int n) {
        String start = str.substring(0, n);
        String end = str.substring(n + 1, str.length());
        return start + end;
    }

}
