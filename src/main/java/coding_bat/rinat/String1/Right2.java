package coding_bat.rinat.String1;

public class Right2 {
    public String right2(String str) {
        if (str.length() < 3){
            return str;
        } else {
            return str.substring(str.length()-2,str.length()) + str.substring(0,str.length()-2);
        }
    }
}
