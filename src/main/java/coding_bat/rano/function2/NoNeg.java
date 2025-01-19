package coding_bat.rano.function2;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }
    public List<Integer> noNeg1(List<Integer> nums1) {
        List<Integer> result = nums1.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
        return result;
    }
}
