package coding_bat.aiza.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        return nums = nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
    }
}
