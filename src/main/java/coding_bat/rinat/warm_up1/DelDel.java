package coding_bat.rinat.warm_up1;

public class DelDel {
    public String delDel(String str) {
        if (str.length() > 3) {
            if ("del".equals(str.substring(1, 4))) {
                return str.substring(0, 1) + str.substring(4);
            }
            return str;
        }
        return str;

    }
}
