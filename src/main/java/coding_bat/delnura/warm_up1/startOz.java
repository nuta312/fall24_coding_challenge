package coding_bat.delnura.warm_up1;

public class startOz {
    public String startOz(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (str.length() >= 2 && str.charAt(0) == 'o' && str.charAt(1) == 'z') {
            return "oz";
        }
        if (str.charAt(0) == 'o') {
            return "o";
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            return "z";
        }
        return "";
    }
}
