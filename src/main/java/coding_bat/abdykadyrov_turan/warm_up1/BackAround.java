package coding_bat.abdykadyrov_turan.warm_up1;

public class BackAround {
    public String backAround(String str) {
        return str.substring(str.length()-1) + str + str.substring(str.length()-1);
    }
}
