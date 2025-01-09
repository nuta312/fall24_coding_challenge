package coding_bat.anara.string_1;

public class without2 {
    public String without2(String str) {
        if (str.length() >= 2){
            if (str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
                return str.substring(2);
            else
                return str;
        }
        else
            return str;
    }
}
