package coding_bat.aiperiishenbekkyzy.functional_1_2;

import java.util.List;

public class noNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }
}
