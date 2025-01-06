package coding_bat.rinat.warm_up2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            result = result + str;
        }
        return result;
    }
}
