package coding_bat.aiperiishenbekkyzy.warm_up1;

public class mixStart {
    public boolean mixStart(String str) {
        if (str.length() < 3)
            return false;
        return str.substring(1,3).equals("ix");
    }
}
