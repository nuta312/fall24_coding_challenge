package coding_bat.Murat.Warmup1;

public class NoString {
    public String notString(String str) {
        if (str.startsWith("not")) return str;
        else if (!str.startsWith("not")) return "not " + str;
        return "";
    }
}