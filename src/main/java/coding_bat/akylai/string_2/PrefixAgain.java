package coding_bat.akylai.string_2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        if (n == 0) {
            return false;
        }
        String str1 = str.substring(0, n);
        if (str.toLowerCase().substring(n).contains(str1.toLowerCase())) {
            return true;
        }
        return false;
    }

}
