package coding_bat.dastanA.warm_up2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str.length() <= 3) {
                sb.append(str);
            } else {
                sb.append(str.substring(0, 3));
            }
        }
        return sb.toString();
    }
}
