package coding_bat.gulasal.warm_up1;

public class DelDel {
    public String delDel(String str) {
        if(str.length() >= 4 && str.substring(1).startsWith("del")) {
            return str.substring(0,1) + str.substring(4, str.length());
        }else {
            return str;
        }
    }
}
