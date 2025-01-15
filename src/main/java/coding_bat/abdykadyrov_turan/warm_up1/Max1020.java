package coding_bat.abdykadyrov_turan.warm_up1;

public class Max1020 {
    public int max1020(int a, int b) {
        int max = Math.max(a, b);
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20){
            return max;
        } else if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        } else {
            return 0;
        }
    }
}
