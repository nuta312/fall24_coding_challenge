package coding_bat.abdykadyrov_turan.warm_up1;

public class Front22 {
    public String front22(String str) {
        if (str.length() <= 1) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }
}
