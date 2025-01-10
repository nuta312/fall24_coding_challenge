package coding_bat.begimai.string1;

public class Left2 {
    public String left2(String str) {
        String first2Chars = str.substring(0, 2);
        String lastChars = str.substring(2, str.length());
        return lastChars + first2Chars;
    }
}
