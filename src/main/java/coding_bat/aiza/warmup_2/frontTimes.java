package coding_bat.aiza.warmup_2;

public class frontTimes {
    public String frontTimes(String str, int n) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(front);
        }
        return result.toString();
    }
}
