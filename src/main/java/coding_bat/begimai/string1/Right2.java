package coding_bat.begimai.string1;

public class Right2 {
    public String right2(String str) {
        String last2Chars = str.substring(str.length()-2);
        String firsChars = str.substring(0, str.length()-2);
        return last2Chars + firsChars;
    }
}
