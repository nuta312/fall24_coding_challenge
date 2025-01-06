package coding_bat.dastank.warm_up1;

public class MissingChar {
    public String missingChar(String str, int n) {
        String str1 = str.substring(0,n)+str.substring(n+1);
        return str1;
    }
}
