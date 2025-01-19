package coding_bat.albina.warm_up1;

public class notString {
    public String notString(String str) {
        if (str.startsWith("не")) {
            return str;
        } else {
            return "не " + str;
        }
    }
}
