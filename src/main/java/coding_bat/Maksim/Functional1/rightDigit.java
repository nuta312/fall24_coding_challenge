package coding_bat.Maksim.Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class rightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
    }
}
