package coding_bat.delnura.String_2;

public class prefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);

        for(int i = n; i <= str.length() - n; i++) {
            if(str.substring(i, i + n).equals(prefix))
                return true;
        }

        return false;
    }
}
