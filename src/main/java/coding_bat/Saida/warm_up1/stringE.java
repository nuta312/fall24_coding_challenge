package coding_bat.Saida.warm_up1;

public class stringE {
    public boolean stringE(String str) {
        int eCount = str.length() - str.replace("e", "")
                .length();
        return eCount >= 1 && eCount <= 3;
    }
}
