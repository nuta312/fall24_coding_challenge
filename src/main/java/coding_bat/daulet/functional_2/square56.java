package coding_bat.daulet.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class square56 {
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
                .filter(n -> (n * n) + 10 != 5)
                .filter(n -> (n * n) + 10 != 6)
                .filter(n -> ((n * n) + 10) % 10 != 5)
                .filter(n -> ((n * n) + 10) % 10 != 6)
                .map(n -> (n * n) + 10)
                .collect(Collectors.toList());
    }

}
