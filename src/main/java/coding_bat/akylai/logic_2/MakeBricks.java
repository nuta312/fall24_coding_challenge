package coding_bat.akylai.logic_2;

public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        if (goal > big * 5 + small) return false;
        if (goal % 5 > small) return false;

        return true;
    }
}
