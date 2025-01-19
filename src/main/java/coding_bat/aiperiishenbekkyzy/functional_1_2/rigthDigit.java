package coding_bat.aiperiishenbekkyzy.functional_1_2;

import java.util.List;

public class rigthDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }
}
