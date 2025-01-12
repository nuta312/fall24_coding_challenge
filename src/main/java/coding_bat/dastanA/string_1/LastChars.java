package coding_bat.dastanA.string_1;

public class LastChars {
    public String lastChars(String a, String b) {
        char first = (a.isEmpty()) ? '@' : a.charAt(0);
        char last = (b.isEmpty()) ? '@' : b.charAt(b.length()-1);
        String str = "" + first + last;
        return str;
    }
}
