package coding_bat.delnura.warm_up1;

public class mixStart {
    public boolean mixStart(String str) {
        if (str.length() >= 3) {
            return str.substring(1, 3).equals("ix");
        }
        return false;
    }
}
