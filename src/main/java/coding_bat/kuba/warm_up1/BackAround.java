package coding_bat.kuba.warm_up1;

public class BackAround {
    public String backAround(String str) {
        if (str.length() >= 1);
        str = str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
        return str;
    }
}
