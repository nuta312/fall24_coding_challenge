package coding_bat.kuba.warm_up1;

public class Front3 {
    public String front3(String str) {
        if (str.length() >= 3) {
            str = str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
            return str;
        } else {
            str = str+str+str;
            return str;
        }
    }
}
