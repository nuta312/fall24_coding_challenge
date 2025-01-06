package coding_bat.rano.warm_up1;

public class EndUp {
    public String endUp(String str) {
        if (str.length () <= 3)
            return str.toUpperCase();
        int cut = str.length() - 3;
        String beg = str.substring (0, cut);
        String end = str.substring (cut);
        return beg + end.toUpperCase();
    }
}
