package coding_bat.aiperiKasymova.warm_up2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String start = str.length() < 3 ? str : str.substring(0, 3);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(start);
        }
        return result.toString();
    }
}
