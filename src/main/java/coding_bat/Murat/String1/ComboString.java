package coding_bat.Murat.String1;

public class ComboString {
    public String comboString(String a, String b) {
        if (a.length() > b.length()) return b + a + b;
        else if (b.length() > a.length()) return a + b + a;
        return "";
    }
}
