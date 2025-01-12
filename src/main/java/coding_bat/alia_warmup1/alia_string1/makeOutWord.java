package coding_bat.alia_warmup1.alia_string1;

public class makeOutWord {
    public String makeOutWord(String out, String word) {
        return out.substring(0,2).concat(word).concat(out.substring(2,4));
    }
}
