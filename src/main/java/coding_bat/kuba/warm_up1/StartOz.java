package coding_bat.kuba.warm_up1;

public class StartOz {
    public String startOz(String str) {
        String result = "";
        if (str.length() >= 2 && str.substring(0, 2).equals("oz")) {
            return str.substring(0, 2);
        } else if (str.length() >= 1 && str.charAt(0)==('o')) {
            return str.substring(0,1);
        } else if (str.length()>= 2 && str.charAt(1)==('z')) {
            return str.substring(1,2);
        }
        return result;
    }
}
