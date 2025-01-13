package coding_bat.dastanA.warm_up1;

public class StartOz {
    public String startOz(String str) {
        if (str.length() >= 2 && str.charAt(0) == 'o' && str.charAt(1) == 'z') {
            return "oz";
        }
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            return "o";
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            return "z";
        }
        return "";
    }
}
