package coding_bat.nasyikat.functional_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg2 {
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }
}
