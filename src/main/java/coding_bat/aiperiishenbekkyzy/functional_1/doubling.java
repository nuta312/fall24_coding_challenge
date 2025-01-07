package coding_bat.aiperiishenbekkyzy.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class doubling {
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

    }

    public List<Integer> doubling2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }
}
