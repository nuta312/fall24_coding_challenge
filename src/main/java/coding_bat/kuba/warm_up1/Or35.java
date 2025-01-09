package coding_bat.kuba.warm_up1;

public class Or35 {
    public boolean or35(int n) {
        if (n > 0) {
            return (n % 3 == 0) || (n % 5 == 0);
        } else {
            return false;}
    }
}

