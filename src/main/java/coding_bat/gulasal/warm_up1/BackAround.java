package coding_bat.gulasal.warm_up1;

public class BackAround {
    public String backAround(String str) {
        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }
}
