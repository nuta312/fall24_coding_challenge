package coding_bat.rano.string2;

public class StarOut {
    public String starOut(String str) {
        String pattern = "([a-zA-Z0-9]{0,1})\\*+([a-zA-Z0-9]{0,1})";
        str = str.replaceAll(pattern, "");
        return str;
    }
}
