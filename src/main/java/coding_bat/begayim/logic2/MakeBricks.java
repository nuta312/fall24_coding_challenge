package coding_bat.begayim.logic2;

public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int maxBigBricks = goal / 5;
        int usedBigBricks = Math.min(maxBigBricks, big);
        int remainingGoal = goal - (usedBigBricks * 5);
        return remainingGoal <= small;
    }
}
