package coding_bat.Maksim.string_1;

public class LastChars {
    public String lastChars(String a, String b) {
        StringBuilder result = new StringBuilder();
        if (a.length() > 0){
            result.append(a.charAt(0));
        }
        else {
            result.append("@");
        }
        if (b.length() > 0){
            result.append(b.charAt(b.length()-1));
        }
        else {
            result.append("@");
        }
        return result.toString();
    }
}
