package coding_bat.begimai.warm_up1;

public class Front3 {
    public String front3(String str) {
        String copy;
        if (str.length() >= 3) {
            copy = str.substring(0, 3);

        } else {
            copy = str;
        }

        return copy + copy + copy;
    }
}
