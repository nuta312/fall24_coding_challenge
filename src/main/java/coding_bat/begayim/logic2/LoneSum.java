package coding_bat.begayim.logic2;

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }if (a == b){
            return c;
        }if (b == c) {
            return a;
        }if (a == c){
            return b;
        } return a+b+c;
    }
}
