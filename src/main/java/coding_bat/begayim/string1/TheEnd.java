package coding_bat.begayim.string1;

public class TheEnd {
    public String theEnd(String str, boolean Front) {
        if (Front) {
            return String.valueOf(str.charAt(0)); // Первый символ
        } else {
            return String.valueOf(str.charAt(str.length() - 1)); // Последний символ
        }
    }
}
