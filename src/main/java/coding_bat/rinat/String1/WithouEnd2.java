package coding_bat.rinat.String1;

public class WithouEnd2 {
    public String withouEnd2(String str) {
        if (str.length() < 2) {
            return "";
        }else {
            return str.substring(1, str.length() - 1);
        }
    }

}
