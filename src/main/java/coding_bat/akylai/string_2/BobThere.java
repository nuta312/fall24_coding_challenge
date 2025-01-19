package coding_bat.akylai.string_2;

public class BobThere {
    public boolean bobThere(String str) {
        String word = "bob";
        if (str.length() > 2) {
            for (int i = 0; i < str.length()-2; i++) {
                if (str.charAt(i) == word.charAt(0) && str.charAt(i + 2) == word.charAt(2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
