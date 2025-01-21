package coding_bat.rinat.String1;

public class ComboString {
    public String comboString(String a, String b) {
        if (a.length() > b.length()){
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

}
