package coding_bat.daulet.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class math1 {
    public List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(n -> (n + 1) * 10)
                .collect(Collectors.toList());
    }
}
