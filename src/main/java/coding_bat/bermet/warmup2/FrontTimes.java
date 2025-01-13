package coding_bat.bermet.warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        if (n == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();

        if (str.length() < 3){
            for (int i = 0; i < n; i ++){
                sb.append(str);
            }
        } else {

            for (int i = 0; i < n; i++) {
                String front = str.substring(0, 3);
                sb.append(front);
            }
        }
        return sb.toString();
    }
}
