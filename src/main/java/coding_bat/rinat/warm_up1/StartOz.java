package coding_bat.rinat.warm_up1;

public class StartOz {
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }
}
