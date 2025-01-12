package coding_bat.akylai.string_2;

public class WordEnds {
    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int index = str.indexOf(word);
        while (index != -1) {
            if (index > 0) {
                result.append(str.charAt(index - 1));
            }
            if (index + word.length() < str.length()) {
                result.append(str.charAt(index + word.length()));
            }
            index = str.indexOf(word, index + 1);
        }
        return result.toString();
    }
}
