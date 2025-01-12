package coding_bat.daulet.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class noNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }
}
