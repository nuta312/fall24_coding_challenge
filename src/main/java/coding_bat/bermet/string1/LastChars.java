package coding_bat.bermet.string1;

public class LastChars {
    public String lastChars(String a, String b) {
        String result;
        if (a.length() == 0){
            a = "@";
        }
        if (b.length() == 0){
            b = "@";
        }
        result = a.substring(0,1) + b.substring(b.length()-1, b.length());
        return result;
    }
}
