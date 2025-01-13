package coding_bat.dastanA.warm_up2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
