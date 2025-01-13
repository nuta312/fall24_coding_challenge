package coding_bat.bermet.string1;

public class MakeOutWorld {
    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,out.length());
    }
}
