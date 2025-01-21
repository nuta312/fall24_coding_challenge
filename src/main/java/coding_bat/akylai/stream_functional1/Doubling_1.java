package coding_bat.akylai.stream_functional1;

import java.util.List;
import java.util.stream.Collectors;

public class Doubling_1 {
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }
}
