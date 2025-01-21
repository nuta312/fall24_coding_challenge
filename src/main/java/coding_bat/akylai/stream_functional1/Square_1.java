package coding_bat.akylai.stream_functional1;

import java.util.List;
import java.util.stream.Collectors;

public class Square_1 {
    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }

}
