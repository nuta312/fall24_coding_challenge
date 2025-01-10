package coding_bat.aygerim_warm_up2;

public class frontTimes {
    public String frontTimes(String str, int n) {
        String subStr = str.length() < 3 ? str : str.substring(0, 3);

        StringBuilder result = new StringBuilder();


        for (int i = 0; i < n; i++) {
            result.append(subStr);
        }


        return result.toString();
    }
}
