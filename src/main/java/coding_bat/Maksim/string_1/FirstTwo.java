package coding_bat.Maksim.string_1;

public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length() <= 2){
            return str;
        } else if (str.length() > 2) {
            return str.substring(0, 2);
        }
        return str;
    }
}
