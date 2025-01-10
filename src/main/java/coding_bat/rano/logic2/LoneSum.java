package coding_bat.rano.logic2;

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        if (a == b && b == c ){
            return  0;
        } else if(a == b){
            return c;
        } else if (b == c) {
            return a;
        } else if (a == c) {
            return b;
        }else {
            return a + b + c;
        }
    }
}
