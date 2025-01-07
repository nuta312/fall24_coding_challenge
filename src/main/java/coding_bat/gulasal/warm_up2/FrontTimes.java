package coding_bat.gulasal.warm_up2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String result = "";
        for(int i = 0; i < n; i++) {
            if(str.length() > 3) {
                result += str.substring(0,3);

            } else {
                result += str;
            }
        }
        return result;
    }
}
