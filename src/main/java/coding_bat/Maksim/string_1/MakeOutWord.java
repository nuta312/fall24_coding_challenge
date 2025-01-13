package coding_bat.Maksim.string_1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String firstpart = out.substring(0, 2);
        String secondpart = out.substring(2, 4);
        return firstpart + word + secondpart;
    }
}
