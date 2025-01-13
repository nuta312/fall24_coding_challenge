package coding_bat.rano.function2;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

    public List<Integer> noTeen1(List<Integer> nums1) {
        List<Integer> result = nums1.stream()
                .filter(n -> n < 13 || n > 19)
                .collect(Collectors.toList());
        return result;
    }
}