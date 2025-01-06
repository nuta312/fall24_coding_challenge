package coding_bat.daulet.warm_up1;

public class missingChar {
    public String missingChar(String str, int n) {
        String x = str.substring(0,n);
        String v = str.substring(n+1);
        return x+v;

    }
}
