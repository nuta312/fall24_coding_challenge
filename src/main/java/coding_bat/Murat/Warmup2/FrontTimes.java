package coding_bat.Murat.Warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String newstr = "";
        for (int i = 1; i <= n; i++) {
            if (str.length() <= 3) {
                newstr += str;
            }
            if (str.length() > 3) {
                newstr += str.substring(0, 3);
            }
        }
        return newstr;
    }
}