package coding_bat.arsen.D.string_1;

public class lastTwo {
    public String lastTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0,str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
        }
        return str;
    }
}
