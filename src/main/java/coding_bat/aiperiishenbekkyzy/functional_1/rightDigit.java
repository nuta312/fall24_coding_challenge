package coding_bat.aiperiishenbekkyzy.functional_1;

import java.util.List;

public class rightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

}
