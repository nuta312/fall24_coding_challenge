package coding_bat.rano.warm_up1;

public class NotString {
    public String notString(String str) {
        if(str.length() >= 3 && str.substring(0, 3).equals("not"))
            return str;

        return "not " + str;
    }
}
