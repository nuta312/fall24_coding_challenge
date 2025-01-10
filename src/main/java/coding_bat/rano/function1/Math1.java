package coding_bat.rano.function1;

import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (1 + n ) * 10);
        return nums;
    }
    public List<Integer> math11(List<Integer> nums1) {
        return nums1.stream()
                .map(n -> (1 + n ) * 10)
                .collect(Collectors.toList());
    }
}
