package coding_bat.akylai.string_1;

public class ComboString {
    public String comboString(String a, String b) {
        if (a.length() > b.length()){
            return b + a + b;
        }else if (a.length() < b.length()){
            return a + b + a;
        }else {
            return "The same length of the strings";
        }
    }
}
