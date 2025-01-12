package coding_bat.gera.string1;

public class Without2 {
    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }

        String end = str.substring(str.length()-2);
        String start = str.substring(0,2);

        if (end.equals(start)){
            return str.substring(2);
        }
        return str;
    }
}
