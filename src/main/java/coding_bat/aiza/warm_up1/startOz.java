package coding_bat.aiza.warm_up1;

public class startOz {
    public String startOz(String str) {
        String result = "";
        if (str.length() > 0 && str.charAt(0) == 'o') {
            result += "o";
        }
        if (str.length() > 1 && str.charAt(1) == 'z') {
            result += "z";
        }

        return result;
    }
}
