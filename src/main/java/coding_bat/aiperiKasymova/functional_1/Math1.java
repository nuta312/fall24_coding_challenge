package coding_bat.aiperiKasymova.functional_1;

import java.util.List;

public class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

}
