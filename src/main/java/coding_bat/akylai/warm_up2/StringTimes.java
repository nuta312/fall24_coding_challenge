package coding_bat.akylai.warm_up2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += str;
        }
        return s;
    }
}
