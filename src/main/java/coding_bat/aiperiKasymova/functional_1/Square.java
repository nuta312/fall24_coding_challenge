package coding_bat.aiperiKasymova.functional_1;

import java.util.List;

public class Square {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll( n -> n * n);
        return nums;
    }
}
