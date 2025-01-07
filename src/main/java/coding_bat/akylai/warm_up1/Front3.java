package coding_bat.akylai.warm_up1;

public class Front3 {
    public String front3(String str) {
        if (str.length() == 1 || str.length() == 2){
            return str + str + str;
        } else if (str.length() > 2) {
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        }
        return str;
    }
}
