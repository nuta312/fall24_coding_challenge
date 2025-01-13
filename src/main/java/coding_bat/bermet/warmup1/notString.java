package coding_bat.bermet.warmup1;

public class notString {
    public String notString(String str) {
        String not = "not";
        if (str.startsWith(not)){
            return str;
        } else {
            return not + " " + str;
        }
    }
}
