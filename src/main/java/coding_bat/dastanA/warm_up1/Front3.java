package coding_bat.dastanA.warm_up1;

public class Front3 {
    public String front3(String str) {
        if (str.length() < 3)
            return str + str + str;
        return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
    }
}
