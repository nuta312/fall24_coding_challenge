package coding_bat.Saida.warm_up1;

public class mixStart {
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1,3)
                .equals("ix");
    }
}
