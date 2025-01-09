package coding_bat.dastanA.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> doubling = nums.stream()
                                .map(n -> n * 2)
                                .collect(Collectors.toList());
        return doubling;
    }
}
