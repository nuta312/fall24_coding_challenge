package coding_bat.rano.warm_up1;

public class Diff21 {
    public int diff21(int n) {
        int sum = Math.abs(21-n);
        if (n>21){
            return 2 * sum;
        } else{
            return sum;
        }
    }
}
