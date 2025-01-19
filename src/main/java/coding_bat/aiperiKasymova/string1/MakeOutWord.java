package coding_bat.aiperiKasymova.string1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String result = out.substring(0, 2).concat(word).concat(out.substring(2, 4));
        return result;
    }
}
