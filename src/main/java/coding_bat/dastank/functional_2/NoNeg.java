package coding_bat.dastank.functional_2;

import java.util.List;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(num -> num <0);
        return nums;
    }
}
