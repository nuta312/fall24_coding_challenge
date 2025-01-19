package coding_bat.Maksim.logic_2;

public class Blackjack {
    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        }
        if (b > 21) {
            return a;
        }
        int diffA = 21 - a;
        int diffB = 21 - b;
        if (diffA < diffB) {
            return a;
        } else {
            return b;
        }
    }
}
