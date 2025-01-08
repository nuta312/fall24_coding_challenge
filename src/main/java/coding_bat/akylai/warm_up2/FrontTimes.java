package coding_bat.akylai.warm_up2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String s = "";
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                s += str;
            }
        } else {
            for (int j = 0; j < n; j++) {
                s += str.substring(0, 3);
            }
        }
        return s;
    }
}
