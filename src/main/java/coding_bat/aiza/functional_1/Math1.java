package coding_bat.aiza.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        return nums = nums.stream()
                .map(n -> n + 1)
                .map(n -> n * 10)
                .collect(Collectors.toList());
    }
}
