package coding_bat.bermet.string1;

public class Right2 {
    public String right2(String str) {
        String result = "";
        String end = "";
        if (str.length() <= 2){
            return str;
        } else {
            end = str.substring(str.length() - 2, str.length());
            result = end + str.substring(0, str.length() - 2);
        }
        return result;
    }
}
