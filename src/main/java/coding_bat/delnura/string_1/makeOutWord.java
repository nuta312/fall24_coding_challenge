package coding_bat.delnura.string_1;

public class makeOutWord {
    public String makeOutWord(String out, String word) {
        String start = out.substring(0, 2);
        String end = out.substring(2, 4);
        return start + word + end;
    }
}
