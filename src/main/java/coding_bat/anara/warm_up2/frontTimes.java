package coding_bat.anara.warm_up2;

public class frontTimes {
    public String frontTimes(String str, int n) {
        String one = "";
        for (int i = 0; i < n; i++) {
            if (str.length() == 1)
                one = one + str.substring(0, 1);
            else if (str.length() == 2)
                one = one + str.substring(0, 2);
            else if (str.length() > 2)
                one = one + str.substring(0, 3);
            else
                return "";
        }
        return one;
    }
}
