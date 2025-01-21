package coding_bat.aiperiishenbekkyzy.string_2;

public class prefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prfx = str.substring(0, n);
        return (str.indexOf(prfx, 1) != -1);
    }

}
