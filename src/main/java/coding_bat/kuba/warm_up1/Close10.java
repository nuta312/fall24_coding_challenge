package coding_bat.kuba.warm_up1;

public class Close10 {
    public int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);
        if (diffA > diffB) {
            return b;
        } else if (diffB > diffA) {
            return a;
        } else
            return 0;
    }
}


