package coding_bat.gera.warm_up1;

public class Diff21 {
    public int diff21(int n) {
        if(n > 21){
            return (n - 21) * 2;
        }
        else if ( n < 21){
            return 21 - n;

        }
        else {
            return 0;
        }
    }
}
