package coding_bat.kuba.warm_up1;

public class Front22 {
    public String front22(String str) {
        if (str.length() >= 2){
            return (str.substring(0,2) + str + str.substring(0,2));
        } else {
        } return (str.substring(0) + str + str.substring(0));
    }
}
