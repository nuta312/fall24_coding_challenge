package coding_bat.aiperiishenbekkyzy.warm_up1;

public class missingChar {
    public String missingChar(String str, int n) {
        String a = str.substring(n, n+1);
        String b = str.substring(0,n);
        String c = str.substring(n+1);
        return b+c ;
    }
}
