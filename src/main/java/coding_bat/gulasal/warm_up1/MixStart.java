package coding_bat.gulasal.warm_up1;

public class MixStart {
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1).startsWith("ix");
    }
}
