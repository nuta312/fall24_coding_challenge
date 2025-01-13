package coding_bat.begayim.logic2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBig = Math.min(goal / 5, big);
        int remaining = goal - maxBig * 5;
        if (remaining <= small) {
            return remaining;
        }
        return -1;
    }
}
