package coding_bat.nasyikat.warm_up1;

public class MissingChar {
    public String missingChar(String str, int n) {
        String first = str.substring(0, n);
        String second = str.substring(n+1, str.length());
        return first + second;
    }
}
