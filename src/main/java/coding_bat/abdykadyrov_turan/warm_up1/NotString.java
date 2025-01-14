package coding_bat.abdykadyrov_turan.warm_up1;

public class NotString {
    public String notString(String str) {
        if (str.equals("not") || str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}
