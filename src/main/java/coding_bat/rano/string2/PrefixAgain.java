package coding_bat.rano.string2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }
}
