package coding_bat.nasyikat.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Square2 {
    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n)
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }
}
