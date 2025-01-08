package coding_bat.begimai.warm_up2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        String front = (str.length() < 3) ? str : str.substring(0, 3);

        for (int i = 0; i < n; i++) {
            sb.append(front);
        }

        return sb.toString();
    }

}
