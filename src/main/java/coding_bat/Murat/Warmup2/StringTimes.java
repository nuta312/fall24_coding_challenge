package coding_bat.Murat.Warmup2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String newstr = "";
        for (int i = 1; i <= n; i++) {
            newstr += str;
        }
        return newstr;
    }
}