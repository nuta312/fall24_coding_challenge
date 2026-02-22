package coding_bat.daulet.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class two2 {
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n * 2 != 2)
                .filter(n -> (n * 2) % 10 != 2)
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

}
