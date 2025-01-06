package coding_bat.bermet_warm_up1;

public class diff21 {
    public int diff21(int n) {
        int result = Math.abs(n - 21);
        if (n > 21){
            return 2 * result;
        } else {
            return result;
        }
    }
}
