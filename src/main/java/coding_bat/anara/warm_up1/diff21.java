package coding_bat.anara.warm_up1;

public class diff21 {
    public int diff21(int n) {
        int different = Math.abs(21 - n);

        if (n > 21) {
            different = Math.abs(n - 21) * 2;

        } return different;

    }
}
