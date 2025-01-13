package coding_bat.dastanA.string_1;

public class ComboString {
    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b.concat(a).concat(b);
        }
        return a.concat(b).concat(a);
    }
}
