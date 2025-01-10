package coding_bat.rano.logic2;

public class Blackjack {
    public int blackjack(int a, int b) {
        if( a > 21 && b > 21) return 0;
        if( a <= 21 && b <= 21) {
            if ( a > b) return a;
            return b;
        }
        if( a > 21 ) {
            return b;
        }
        return a;
    }
}
