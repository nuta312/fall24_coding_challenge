package coding_bat.nasyikat.logic_2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxLargeBars = goal / 5;
        int largeBarsUsed = Math.min(maxLargeBars, big);
        int remainder = goal - (largeBarsUsed * 5);
        if (remainder <= small) {
            return remainder;
        } else {
            return -1;
        }
    }
}
