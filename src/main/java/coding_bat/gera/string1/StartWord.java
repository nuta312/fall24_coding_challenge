package coding_bat.gera.string1;

public class StartWord {
    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }

        String prefix = str.substring(0, word.length());

        if (prefix.substring(1).equals(word.substring(1))) {
            return prefix;
        }

        return "";
    }
}
