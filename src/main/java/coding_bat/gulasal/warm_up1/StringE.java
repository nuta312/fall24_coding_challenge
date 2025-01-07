package coding_bat.gulasal.warm_up1;

public class StringE {
    public boolean stringE(String str) {
        String noE = str.replace("e", "");
        int difference = str.length() - noE.length();

        return difference >= 1 && difference <= 3;
    }
}
