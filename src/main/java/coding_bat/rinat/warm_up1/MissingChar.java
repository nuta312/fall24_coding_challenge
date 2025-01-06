package coding_bat.rinat.warm_up1;

public class MissingChar {
    public String missingChar(String str, int n) {
        if (n < str.length()){
            StringBuilder str2 = new StringBuilder(str);
            str2.deleteCharAt(n);
            return str2.toString();
        } else {
            return str;
        }
    }
}
