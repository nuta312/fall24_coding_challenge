package coding_bat.delnura.string_1;

public class comboString {
    public String comboString(String a, String b) {
        return (a.length() < b.length()) ? a + b + a : b + a + b;
    }
}
