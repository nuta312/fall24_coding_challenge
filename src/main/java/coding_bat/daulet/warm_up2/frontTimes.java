package coding_bat.daulet.warm_up2;

public class frontTimes {
    public String frontTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        if (str.length() < 0 && n > 0 || str.length() > 0 && n < 0){
            return "";
        } else if (str.length()>4) {
            for (int i = 0; i < n; i++) {
                result.append(str.substring(0,3));
            }String repeat = result.toString();
            return repeat;
        } else if (str.length()<4) {
            for (int i = 0; i < n; i++) {
                result.append(str);
            }String repeat = result.toString();
            return repeat;
        }else {
            return "";
        }
    }
}
