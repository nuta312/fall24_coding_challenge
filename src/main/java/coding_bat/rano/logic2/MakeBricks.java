package coding_bat.rano.logic2;

public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int remainder = goal >= (5 * big) ? goal - (5 * big) : goal % 5;
        return small >= remainder;
    }
}
