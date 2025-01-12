package coding_bat.Maksim.logic_2;

public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int usedBig = Math.min(goal / 5, big);
        int remainder = goal - usedBig * 5;
        return remainder <= small;
    }
}
