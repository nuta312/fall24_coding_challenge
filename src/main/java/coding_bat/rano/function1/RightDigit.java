package coding_bat.rano.function1;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }
    public List<Integer> rightDigit1(List<Integer> nums1) {
        return nums1.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
    }
}
