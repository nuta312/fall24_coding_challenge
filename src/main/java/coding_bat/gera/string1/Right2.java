package coding_bat.gera.string1;

public class Right2 {
    public String right2(String str) {
        if (str.length() > 2){
            String last = str.substring(str.length()-2);
            String second = str.substring(0,str.length()-2);
            return last+ second;
        }
        else {
            return str;
        }
    }
}
