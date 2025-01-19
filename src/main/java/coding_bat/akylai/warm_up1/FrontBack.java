package coding_bat.akylai.warm_up1;

public class FrontBack {
    public String frontBack(String str) {
        if (str.length() == 1 || str.isEmpty()) {
            return str;
        } else {
            return str = (str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0));
        }
    }
}
