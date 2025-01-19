package coding_bat.akylai.warm_up1;

public class DelDel {
    public String delDel(String str) {
        if (str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring( 4);
        } else {
            return str;
        }
    }
}
