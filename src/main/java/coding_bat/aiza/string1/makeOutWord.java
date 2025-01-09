package coding_bat.aiza.string1;

public class makeOutWord {
    public String makeOutWord(String out, String word) {
        String left = out.substring(0, 2);
        String right = out.substring(2);
        String result = left + word + right;
        return result;
    }
}
