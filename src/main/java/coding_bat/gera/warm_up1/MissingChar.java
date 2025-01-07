package coding_bat.gera.warm_up1;

public class MissingChar {
    public String missingChar(String str, int n) {
        String f = str.substring(0, n);
        String s = str.substring(n + 1);
        return f + s;
    }

}
