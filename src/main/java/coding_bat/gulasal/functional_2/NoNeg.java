package coding_bat.gulasal.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {

        // nums.removeIf(n -> n < 0);
        // return nums;

        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }
}
