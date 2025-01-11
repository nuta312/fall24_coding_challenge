package coding_bat.begayim.string2;

public class WordEnds {
    public String wordEnds(String str, String word) {
        String result = "";

        for (int i = 0; i < str.length() - word.length() + 1; i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
                if (i > 0) {
                    result += str.charAt(i - 1);
                }
                if (i + word.length() < str.length()) {
                    result += str.charAt(i + word.length());
                }
            }
        }
        return result;
    }
}
