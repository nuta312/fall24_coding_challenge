package coding_bat.delnura.warm_up1;

public class notString {
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}
