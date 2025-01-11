package coding_bat.rinat.String1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String str = out.substring(0, out.length()/2) + word + out.substring(out.length()/2) + out.substring(out.length());
        return str;
    }
}
